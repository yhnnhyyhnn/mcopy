package cn.com.mcopy.route;

import cn.com.mcopy.db.model.mcopy.Menu;
import cn.com.mcopy.service.MenusService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.List;
import java.util.Map;

import static spark.Spark.get;

/**
 * Created by ucenter on 2016/11/20.
 */
@Component
public class indexRoute {

    private Logger logger = LoggerFactory.getLogger(indexRoute.class);

    @Autowired
    private MenusService menusService;

    @PostConstruct
    public void init(){
        get("/menu/getChildren",(request,response)->{
            Map<String, List<Menu>> allSecondMenu = menusService.queryAllSecondMenu();
            logger.info(JSON.toJSONString(allSecondMenu));
            if(allSecondMenu!=null && !allSecondMenu.isEmpty()){
                return JSON.toJSONString(allSecondMenu);
            }
            return null;
        });
    }
}
