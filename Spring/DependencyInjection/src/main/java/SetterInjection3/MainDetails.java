package SetterInjection3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDetails {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SI3_Config.xml");
		
		Person p1 = (Person) context.getBean("p1");
		
		System.out.println(p1);
	}
}
