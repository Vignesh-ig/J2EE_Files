package has;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import product.Product;
import product.ProductConfig;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		Bank b = (Bank) context.getBean("b1");
		b.getBalance();
	}
}
