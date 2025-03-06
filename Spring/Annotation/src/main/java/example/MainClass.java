package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CityConfig.class);
		City c = (City) context.getBean("c1");
		c.getPerson();
	}
}
