package PredefinedClassObjectCreating;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("t")
public class Test {
	
	@Autowired
	Object o;
	
	@Autowired
	List<String> boys;
	
	@Autowired
	Set<Integer> contact;
	
	@Autowired
	Map<Integer, String> details;
	
	public void t1() {
		System.out.println(o);
		System.out.println(boys);
		System.out.println(contact);
		System.out.println(details);
	}
	
}
