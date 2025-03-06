package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EMP_Config.class);
		
		Employee e = (Employee) context.getBean("e1");
		e.m1();
		
	}
}
