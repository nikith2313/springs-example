 package SpingsExample.Services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpingsExample.Dao.DBConnection;

public class AppContext {

	
	public static ApplicationContext appContext(){
		ApplicationContext context=new AnnotationConfigApplicationContext(DBConnection.class);
		return context;
	}
}
