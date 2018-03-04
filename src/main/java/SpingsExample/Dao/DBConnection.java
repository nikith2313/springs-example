package SpingsExample.Dao;

import javax.activation.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@Configuration
@ComponentScan({"SpingsExample.Beans","SpingsExample.Dao","SpingsExample.Exception","SpingsExample.Services","springsApp"})
@PropertySource("classpath:credentials.properties")
public class DBConnection {
	
	
	@Autowired
	Environment env;
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public DataSource createDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("driver.name"));
		ds.setUrl(env.getProperty("connection.url"));
		ds.setUsername(env.getProperty("db.username"));
		ds.setPassword(env.getProperty("db.password"));

		// the settings below are optional -- dbcp can work with defaults
		ds.setMinIdle(5);
		ds.setMaxIdle(20);
		ds.setMaxOpenPreparedStatements(180);

		return (DataSource) ds;
	}

}