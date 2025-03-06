package ConstructorInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("employee.xml");
		
		Employee e=(Employee) context.getBean("emp");
		
		
		System.out.println(e);
		
	}

}
