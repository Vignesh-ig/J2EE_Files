package Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		Demo d1 = (Demo) context.getBean("d");
		Demo d2 = (Demo) context.getBean("d");
		Demo d3 = (Demo) context.getBean("d");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
