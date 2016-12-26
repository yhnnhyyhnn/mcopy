package cn.com.mcopy.init;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ucenter on 2016/11/2.
 */

public class InitDB {

    @Value("${execute}")
    private String execute;

    @Value("${url}")
    private String url;

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

    @Autowired
    public DruidDataSource dataSource;

    @PostConstruct
    public void init() {
        boolean b = Boolean.parseBoolean(execute);
        if(b){
            DataSource ds = new DriverManagerDataSource(url, user, password);

            Connection conn = null;
            try {
                conn = ds.getConnection();

                ScriptRunner runner = new ScriptRunner(conn);
                runner.setAutoCommit(true);
                runner.setSendFullScript(true);
                try {
                    System.out.println("开始执行脚本。。。");
                    runner.runScript(Resources.getResourceAsReader("sql/init.sql"));
                    System.out.println("脚本执行完成。。。");
                    ResultSet rs = conn.getMetaData().getTables(null, null, null, null);
                    while (rs.next()) {
                        String ts = rs.getString("TABLE_SCHEM");
                        String tc = rs.getString("TABLE_CAT");
                        String tt = rs.getString("TABLE_NAME");
                        String tp = rs.getString("TABLE_TYPE");
                        System.out.println("表的CATALOG " + tc + " 表的SCHEMA " + ts + " 表的名称 " + tt + "   表的类型 " + tp);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                conn = ds.getConnection();
                ScriptRunner runner = new ScriptRunner(conn);
                runner.setAutoCommit(true);
                runner.setSendFullScript(true);
                try {
                    System.out.println("开始执行脚本。。。");
                    runner.runScript(Resources.getResourceAsReader("sql/initdata.sql"));
                    System.out.println("脚本执行完成。。。");
                    ResultSet rs = conn.getMetaData().getTables(null, null, null, null);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if(conn != null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
