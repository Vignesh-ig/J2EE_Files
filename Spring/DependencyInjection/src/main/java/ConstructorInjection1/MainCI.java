package ConstructorInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CI1_Config.xml");
		
		Bus b1 = (Bus) context.getBean("b1");
		System.out.println(b1);
		
	}
}
