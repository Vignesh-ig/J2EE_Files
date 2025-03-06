package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainS1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		
		S1 s = (S1) context.getBean("s1");
		s.m1();
		
	}

}
