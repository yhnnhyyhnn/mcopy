package cn.com.mcopy.route;

import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.db.model.mcopy.Tabs;
import cn.com.mcopy.service.MenusService;
import cn.com.mcopy.service.TabsService;
import cn.com.mcopy.vo.MenuVO;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

/**
 * Created by ucenter on 2017/1/1.
 */
@Component
public class FwwdRoute {
    private Logger logger = LoggerFactory.getLogger(FwwdRoute.class);

    @Autowired
    private MenusService menusService;

    @Autowired
    private TabsService tabsService;

    @PostConstruct
    public void init(){
        get("/fwwd",(request,response)->{
            //查看是否有子菜单
            List<Menu> menus = menusService.querySecondMenu("服务网点");
            if(menus!=null && !menus.isEmpty()){
                Menu m = menus.get(0);
                response.redirect(m.getURL());
                return null;
            }else{
                Menu menu = menusService.getMenu(103);
                List<Tabs> tabsList = tabsService.list(String.valueOf(menu.getMENU_ID()));
                Map<String,Object> model = new HashMap<>();
                model.put("content",menu.getCONTENT());
                model.put("tabslist",new ArrayList<Tabs>());
                model.put("list",new ArrayList<Menu>());
                return new ModelAndView(model,"pc/fwwdtemplate.ftl");
            }

        },new FreeMarkerEngine());

        get("/fwwd/:secondmenu",(request,response)->{
            Map<String,Object> map = new HashMap<>();
            String seconfmenu = request.params(":secondmenu");
            List<MenuVO> voList = menusService.query(null,seconfmenu);
            List<Tabs> tabsList = new ArrayList<>();
            if(voList!=null && !voList.isEmpty()){
                map.put("content",voList.get(0).getCONTENT());
                map.put("currentmenu",voList.get(0).getMENUNAME());
                Menu menu = menusService.getMenu(voList.get(0).getMENU_ID());
                tabsList = tabsService.list(String.valueOf(menu.getMENU_ID()));
                logger.info(JSON.toJSONString(tabsList));
            }

            //二级子菜单列表
            List<Menu> menus = menusService.querySecondMenu("服务网点");
            map.put("list",menus);
            map.put("tabslist",tabsList);
            return new ModelAndView(map,"pc/fwwdtemplate.ftl");
        },new FreeMarkerEngine());
    }
}
