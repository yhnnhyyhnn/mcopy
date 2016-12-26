package cn.com.mcopy.route;

import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.db.model.mcopy.News;
import cn.com.mcopy.service.MenusService;
import cn.com.mcopy.service.NewsService;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static spark.Spark.get;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ucenter on 2016/12/5.
 */
@Component
public class NewsRoute {

    @Autowired
    private NewsService newsService;

    @Autowired
    private MenusService menusService;

    @PostConstruct
    public void initNews(){
        get("/xwzx",(request,response)->{
            Map<String,Object> model = new HashMap<>();
            List<News> list = newsService.list();
            List<Menu> menus = menusService.querySecondMenu("关于我们");
            model.put("list",list);
            model.put("menulist",menus);
            return new ModelAndView(model,"pc/newstemplate.ftl");
        },new FreeMarkerEngine());

        get("/xwzx/get/:newid",(request,response)->{
            String newid = request.params(":newid");
            News news = newsService.getNews(NumberUtils.toInt(newid));
            List<Menu> menus = menusService.querySecondMenu("关于我们");
            Map<String,Object> model = new HashMap<>();
            model.put("list",menus);
            model.put("news",news);
            newsService.addRead(NumberUtils.toInt(newid),news.getREADCOUNT());
            return new ModelAndView(model,"pc/newsdetailtemplate.ftl");
        },new FreeMarkerEngine());
    }
}
