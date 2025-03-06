package SetterInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SetterInjection.Employee;

public class MainHuman {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SI1_Config.xml");
		
		Human h1 = (Human) context.getBean("H1");
		Human h2 = (Human) context.getBean("H2");
		Human h3 = (Human) context.getBean("H3");
		Human h4 = (Human) context.getBean("H4");
		Human h5 = (Human) context.getBean("H5");
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
	}
}
