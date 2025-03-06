package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SI_Config.xml");
		
		Employee e1 = (Employee) context.getBean("SI1");
		Employee e2 = (Employee) context.getBean("SI2");
		System.out.println(e1);
		System.out.println(e2);
	}

}
