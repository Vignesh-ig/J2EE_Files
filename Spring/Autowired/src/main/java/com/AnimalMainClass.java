package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalMainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		Zoo z = (Zoo) context.getBean("zoo");
		z.getAnimal();
 
	}
}
