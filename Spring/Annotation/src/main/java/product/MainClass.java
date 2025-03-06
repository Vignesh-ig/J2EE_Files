package product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		Product p = (Product) context.getBean("p1");
		System.out.println(p);
	}

}
