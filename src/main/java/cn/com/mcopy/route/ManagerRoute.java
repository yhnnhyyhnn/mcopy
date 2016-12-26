package cn.com.mcopy.route;

import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.db.model.mcopy.News;
import cn.com.mcopy.db.model.mcopy.Tabs;
import cn.com.mcopy.db.model.mcopy.Users;
import cn.com.mcopy.service.*;
import cn.com.mcopy.util.FileUtil;
import cn.com.mcopy.vo.DataVO;
import cn.com.mcopy.vo.MenuVO;
import cn.com.mcopy.vo.TabsVO;
import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import javax.annotation.PostConstruct;
import java.util.*;

import static spark.Spark.*;


/**
 * Created by ucenter on 2016/11/8.
 */
@Component
public class ManagerRoute {

    private Logger logger = LoggerFactory.getLogger(ManagerRoute.class);

    @Autowired
    private UsersService usersService;

    @Autowired
    private MenusService menusService;

    @Autowired
    private TabsService tabsService;

    @Autowired
    private DBManagerService dbManagerService;

    @Autowired
    private NewsService newsService;

    private Users getAuthenticatedUser(spark.Request request) {
        return request.session().attribute("user");
    }

    private void addAuthenticatedUser(spark.Request request, Users u) {
        request.session().attribute("user", u);

    }

    private void removeAuthenticatedUser(spark.Request request) {
        request.session().removeAttribute("user");

    }

    @PostConstruct
    public void initManage() {

        //登陆页面
        get("/manage/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model, "manage/login.ftl");
        }, new FreeMarkerEngine());

        get("/common/head", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model, "manage/common/head.ftl");
        }, new FreeMarkerEngine());

        get("/common/foot", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model, "manage/common/foot.ftl");
        }, new FreeMarkerEngine());

        get("/common/dialogWindow", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model, "manage/common/dialogWindow.ftl");
        }, new FreeMarkerEngine());

        //进入后台页面过滤，必须登陆
        before("/manage/*",(request,response)->{
            logger.info("request.url()={},request.raw().getRequestURI()={}",request.url(),request.raw().getRequestURI());
            Users user = getAuthenticatedUser(request);
            if(null == user && !request.raw().getRequestURI().equals("/manage/login")){
                response.redirect("/manage/login");
                halt();
            }
        });

        //后台主页面
        post("/manage", (request, response) -> {
            String username = request.queryParams("username");
            String password = request.queryParams("password");
            String rememberme = request.queryParams("rememberme");
            logger.info("登陆信息：username={},password={},rememberme={}",username,password,rememberme);
            Users users = usersService.checkLogin(username, password);
            Map<String, Object> model = new HashMap<>();
            if(users==null){
                logger.error("用户名或密码无效");
                model.put("error","用户名或密码无效");
                return new ModelAndView(model, "manage/login.ftl");
            }else{
                //登陆成功后，将用户放在session中
                request.session().attribute("user",users);
                //如果点了记住我，则将用户信息放到cookie中
                if(rememberme != null){
                    response.cookie("username",username);
                    response.cookie("password",password);
                }

                model.put("users",users);
                return new ModelAndView(model, "manage/main.ftl");
            }



        }, new FreeMarkerEngine());

        get("/manage/index", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model, "manage/index.ftl");
        }, new FreeMarkerEngine());

        //查询用户列表
        get("/manage/users", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Users users = new Users();
            List<Users> usersList = usersService.queryList(users);
            if (null != usersList && !usersList.isEmpty()) {
                for (Users u : usersList) {
                    if (u.getUSERLEVEL().equals("1")) {
                        u.setUSERLEVEL("普通用户");
                    }
                    if (u.getUSERLEVEL().equals("2")) {
                        u.setUSERLEVEL("管理员");
                    }
                }
            }
            model.put("list", usersList);
            return new ModelAndView(model, "manage/users.ftl");
        }, new FreeMarkerEngine());

        //用户新增
        post("/manage/users/add", (request, response) -> {
            Map<String,String> result = new HashMap<>();
            String username = request.queryParams("username");
            String loginname = request.queryParams("loginname");
            String password = request.queryParams("password");
            String userlevel = request.queryParams("userlevel");

            Users users = new Users();
            users.setLOGINNAME(loginname);
            List<Users> list = usersService.queryList(users);

            if(list!=null && list.size()>0){
                result.put("result","0");
                result.put("message","用户登陆账号已存在");
            }else{
                users.setCREATETIME(new Date());
                users.setPASSWORD(password);
                users.setUSERLEVEL(userlevel);
                users.setUSERNAME(username);
                usersService.add(users);
                result.put("result","1");
            }
            logger.info(JSON.toJSONString(result));
            return JSON.toJSONString(result);
        });

        //用户删除
        post("/manage/users/delete", (request, response) -> {
            String userid = request.queryParams("user_id");
            usersService.delete(Integer.parseInt(userid));
            return "success";
        });

        //用户修改
        post("/manage/users/update", (request, response) -> {
            String username = request.queryParams("username");
            String loginname = request.queryParams("loginname");
            String password = request.queryParams("password");
            String userlevel = request.queryParams("userlevel");
            String user_id = request.queryParams("user_id");
            Users users = new Users();
            users.setCREATETIME(new Date());
            users.setLOGINNAME(loginname);
            users.setPASSWORD(password);
            users.setUSERLEVEL(userlevel);
            users.setUSERNAME(username);
            users.setUSER_ID(Integer.parseInt(user_id));
            usersService.update(users);
            return "success";
        });

        //菜单管理
        get("/manage/menus", (request, response) -> {
            Menu menu = new Menu();
            MenuVO menuVO = new MenuVO();
            List<MenuVO> menus = menusService.query(null,null);
            if (menus != null && !menus.isEmpty()) {
                for (MenuVO m : menus) {
                    Menu menu1 = menusService.getMenu(m.getPARENT());
                    if (menu1 != null) {
                        m.setPARENTSTR(menu1.getMENUNAME());
                    } else {
                        m.setPARENTSTR("-");
                    }
                    switch (m.getMENULEVEL()) {
                        case "1":
                            m.setMENULEVEL("一级");
                            break;
                        case "2":
                            m.setMENULEVEL("二级");
                            break;
                    }
                    switch (m.getUSETEMP()) {
                        case "0":
                            m.setUSETEMP("不启用");
                            break;
                        case "1":
                            m.setUSETEMP("启用");
                            break;
                    }
                }
            }
            Map<String, Object> model = new HashMap<>();
            model.put("list", menus);
            return new ModelAndView(model, "/manage/menus.ftl");
        }, new FreeMarkerEngine());

        //新增菜单
        get("/manage/menus/add", (request, response) -> {
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));
            Menu menu = new Menu();
            BeanUtils.copyProperties(menu,map);
            String[] s = StringUtils.substringsBetween(menu.getCONTENT(), "file:///", "\" ");
            String[] newFiles = null;
            if(s!=null && s.length > 0){
                newFiles = FileUtil.uploadFiles(s);
            }
            logger.info("替换content中的图片地址");
            if(newFiles!=null && newFiles.length > 0){
                for(int i=0;i<s.length;i++){
                    logger.info("图片地址的位置：{}",menu.getCONTENT().indexOf(s[i]));
                    String content = menu.getCONTENT().replace("file:///"+s[i],newFiles[i]);
                    menu.setCONTENT(content);
                }
            }

            menusService.add(menu);
            return "success";
        });

        //查询菜单明细
        get("/manage/menus/get/:menuid",(request,response)->{
            String menuid = request.params(":menuid");
            Menu menu = menusService.getMenu(NumberUtils.toInt(menuid));
            return JSON.toJSONString(menu);
        });

        //修改菜单信息
        get("/manage/menus/update/:menuid",(request,response)->{
            String menuid = request.params(":menuid");
            logger.info("开始更新菜单信息：{}",menuid);
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));
            Menu menu = new Menu();
            BeanUtils.copyProperties(menu,map);

            String[] s = StringUtils.substringsBetween(menu.getCONTENT(), "file:///", "\" ");
            String[] newFiles = null;
            if(s!=null && s.length > 0){
                newFiles = FileUtil.uploadFiles(s);
            }
            logger.info("替换content中的图片地址");
            if(newFiles!=null && newFiles.length > 0){
                for(int i=0;i<s.length;i++){
                    logger.info("图片地址的位置：{}",menu.getCONTENT().indexOf(s[i]));
                    String content = menu.getCONTENT().replace("file:///"+s[i],newFiles[i]);
                    menu.setCONTENT(content);
                }
            }

            menu.setMENU_ID(NumberUtils.toInt(menuid));
            menusService.updateMenu(menu);
            logger.info("菜单更新成功！");
            return "success";
        });

        //删除菜单
        get("/manage/menus/delete/:menuid",(request,response)->{
            String menuid = request.params(":menuid");
            menusService.deleteMenu(NumberUtils.toInt(menuid));
            return "success";
        });

        get("/manage/tabs", (request, response) -> {
            List<Tabs> list = tabsService.list(null);
            List<TabsVO> tabsVOs = new ArrayList<>();
            if(list!=null && !list.isEmpty()){
                for(Tabs tabs: list){
                    TabsVO vo = new TabsVO();
                    BeanUtils.copyProperties(vo,tabs);
                    Menu menu = menusService.getMenu(tabs.getMENU_ID());
                    vo.setMENUNAME(menu.getMENUNAME());
                    tabsVOs.add(vo);
                }
            }

            Map<String,Object> model = new HashMap<>();
            model.put("list",tabsVOs);
            return new ModelAndView(model,"/manage/tabs.ftl");
        }, new FreeMarkerEngine());

        get("/manage/tabs/menulist",(request,response)->{
            Map<String,Integer> ret = new HashMap<>();
            Map<String, List<Menu>> secondMenu = menusService.queryAllSecondMenu();
            secondMenu.forEach((k,v)->{
                v.forEach(m->{
                    //只需要启用模板的二级菜单
                    if(m.getUSETEMP().equals("1")){
                        ret.put(m.getMENUNAME(),m.getMENU_ID());
                    }
                });
            });
            return JSON.toJSONString(ret);
        });

        post("/manage/tabs/add",(request,response)->{
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));

            Tabs tabs = new Tabs();
            BeanUtils.copyProperties(tabs,map);
            tabs.setMENU_ID(Integer.parseInt(map.get("MENUNAME")));

            String[] s = StringUtils.substringsBetween(tabs.getCONTENT(), "file:///", "\" ");
            String[] newFiles = null;
            if(s!=null && s.length > 0){
                newFiles = FileUtil.uploadFiles(s);
            }
            logger.info("替换content中的图片地址");
            if(newFiles!=null && newFiles.length > 0){
                for(int i=0;i<s.length;i++){
                    logger.info("图片地址的位置：{}",tabs.getCONTENT().indexOf(s[i]));
                    String content = tabs.getCONTENT().replace("file:///"+s[i],newFiles[i]);
                    tabs.setCONTENT(content);
                }
            }

            tabsService.add(tabs);

            return "success";
        });

        get("/manage/tabs/get/:tabid",(request,response)->{
            String tabid = request.params(":tabid");
            Tabs tab = tabsService.getTab(NumberUtils.toInt(tabid));

            return JSON.toJSONString(tab);
        });

        post("/manage/tabs/delete/:tabid",(request,response)->{
            String tabid = request.params(":tabid");
            tabsService.delete(NumberUtils.toInt(tabid));
            return "success";
        });

        post("/manage/tabs/update/:tabid",(request,response)->{
            String tabid = request.params(":tabid");
            logger.info("开始更新tab信息：{}",tabid);
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));
            Tabs tab = new Tabs();
            BeanUtils.copyProperties(tab,map);
            tab.setMENU_ID(Integer.parseInt(map.get("MENUNAME")));

            String[] s = StringUtils.substringsBetween(tab.getCONTENT(), "file:///", "\" ");
            String[] newFiles = null;
            if(s!=null && s.length > 0){
                newFiles = FileUtil.uploadFiles(s);
            }
            logger.info("替换content中的图片地址");
            if(newFiles!=null && newFiles.length > 0){
                for(int i=0;i<s.length;i++){
                    logger.info("图片地址的位置：{}",tab.getCONTENT().indexOf(s[i]));
                    String content = tab.getCONTENT().replace("file:///"+s[i],newFiles[i]);
                    tab.setCONTENT(content);
                }
            }

            tab.setTAB_ID(NumberUtils.toInt(tabid));
            tabsService.update(tab);
            logger.info("菜单更新成功！");
            return "success";
        });

        get("/manage/news",(request,response)->{
            List<News> newsList = newsService.list();
            Map<String,Object> model = new HashMap<>();
            model.put("list",newsList);
            logger.info(JSON.toJSONStringWithDateFormat(newsList,"yyyy-MM-dd"));

            return new ModelAndView(model,"manage/news.ftl");
        },new FreeMarkerEngine());

        get("/manage/news/add",(request,response)->{
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));

            News news = new News();
            BeanUtils.copyProperties(news,map);
            news.setREADCOUNT(0);
            news.setCREATEDATE(new Date());
            newsService.add(news);
            return "success";
        });

        get("/manage/news/get/:newid",(request,response)->{
            String newid = request.params(":newid");
            News news = newsService.getNews(NumberUtils.toInt(newid));

            return JSON.toJSONString(news);
        });

        post("/manage/news/update/:newid",(request,response)->{
            String newid = request.params(":newid");
            logger.info("newid={}",newid);
            Set<String> params = request.queryParams();
            Map<String,String> map = new HashMap<>();
            params.forEach(s->{
                map.put(s,request.queryParams(s));
            });
            logger.info(JSON.toJSONString(map));
            News news=new News();
            BeanUtils.copyProperties(news,map);
            news.setNEW_ID(NumberUtils.toInt(newid));
            newsService.update(news);

            return "success";
        });

        post("/manage/news/delete/:newid",(request,response)->{
            String newid = request.params(":newid");
            newsService.delete(NumberUtils.toInt(newid));
            return "success";
        });

        get("/manage/dbManager", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "manage/dbManager.ftl");
        }, new FreeMarkerEngine());

        //根据SQL查询数据
        get("/manage/dbManager/query", (request, response) -> {
            String condition = request.raw().getParameter("condition");
            List<Map<String, Object>> list = dbManagerService.executeQuery(condition);
            //将Map中的KEY和VALUE分开，KEY就是列名，VALUE是值
            if (list != null && !list.isEmpty()) {
                String s = JSON.toJSONString(list);
                logger.info("查询结果：{}", s);
                return s;
            }
            return null;
        });

    }

}
