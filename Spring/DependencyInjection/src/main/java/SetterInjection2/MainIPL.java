package SetterInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainIPL {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SI2_Config.xml");
		
		IPL ipl = (IPL) context.getBean("ipl1");
		
		System.out.println(ipl);
	}

}
