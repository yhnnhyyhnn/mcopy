package cn.com.mcopy.server;

import cn.com.mcopy.init.InitWebRoute;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static spark.Spark.*;


/**
 * Created by ucenter on 2016/10/15.
 */
public class AppServer {

    public static void main(String[] args) {

        port(9999);
        threadPool(30);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitWebRoute.class);

        context.registerShutdownHook();
    }

}
