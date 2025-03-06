package in;

import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {

	public Employee() {
		System.out.println("Constructor called");
	}

	public void m1() {
		System.out.println("m1 called");
	}
}
