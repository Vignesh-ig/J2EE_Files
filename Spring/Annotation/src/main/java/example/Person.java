package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Person {
	@Value("1")
	private int pid;
	@Value("dinesh")
	private String pname;
	@Value("23")
	private int age;
	@Value("male")
	private String gender;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + ", gender=" + gender + "]";
	}

}
