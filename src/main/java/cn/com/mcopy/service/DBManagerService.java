package cn.com.mcopy.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ucenter on 2016/11/8.
 */
@Component("dBManagerService")
public class DBManagerService {
    private Logger logger = LoggerFactory.getLogger(DBManagerService.class);
    @Autowired
    private DruidDataSource dataSource;

    public List<Map<String,Object>> executeQuery(String sql) {
        logger.info("执行SQL:{}",sql);
        List<Map<String,Object>> list = new ArrayList<>();
        DruidPooledConnection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            if(sql.startsWith("update") || sql.startsWith("delete")){
                statement.execute();
                return list;
            }
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Map<String,Object> map = new HashMap<>();
                int columnCount = resultSet.getMetaData().getColumnCount();
                for(int i=0;i<columnCount;i++){
                    map.put(resultSet.getMetaData().getColumnName(i+1),resultSet.getObject(i+1));
                }
                list.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
