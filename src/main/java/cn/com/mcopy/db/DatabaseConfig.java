package cn.com.mcopy.db;//package cn.com.mcopy.db;
//
//import java.sql.SQLException;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//@ComponentScan("cn.com.mcopy")
//@PropertySource("classpath:config/db.properties")
//public class DatabaseConfig {
//	
//	@Resource
//    private Environment environment;
//	
//	@Bean
//	public DataSource getDataSource(){
//		DataSource ds = new DriverManagerDataSource(environment.getRequiredProperty("url"), 
//				environment.getRequiredProperty("user"), 
//				environment.getRequiredProperty("password"));
//		try {
//			ds.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return ds;
//	}
//}
