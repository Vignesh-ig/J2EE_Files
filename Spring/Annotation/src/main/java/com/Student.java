package com;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

	public Student() {
		System.out.println("Student Constructor Called");

	}

	void m1() {
		System.out.println("Hello world");
	}

}
