package PredefinedClassObjectCreating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		Test t = (Test) context.getBean("t");
		t.t1();
	}

}
