package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		Student s=(Student) context.getBean("s1");
//		s.m1();
		System.out.println(s);

	}

}
