package cn.com.mcopy.init;

import cn.com.mcopy.util.CheckMobile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

/**
 * 与applicationContext.xml功能一样
 * @author luokai
 *
 */
@Configuration
@ComponentScan("cn.com.mcopy")
@ImportResource("")
@Import(InitDatabase.class)
public class InitWebRoute {

    private Logger logger = LoggerFactory.getLogger(InitWebRoute.class);

    @PostConstruct
    public void init(){
        staticFileLocation("/public");
        get("/", (request,response) -> {
            String userAgent = request.userAgent().toLowerCase();
            if(CheckMobile.check(userAgent)){
                logger.info("移动端访问.....");
            }
            Map<String,Object> model = new HashMap<>();
            model.put("title", "first one");
            return new ModelAndView(model ,"pc/index.ftl");
        },new FreeMarkerEngine());



    }
}
