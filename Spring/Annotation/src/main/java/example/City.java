package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import has.SBI;

@Component("c1")
public class City {
	
	@Autowired
	Person p;
	
	public void getPerson() {
		System.out.println(p);
	}
}
