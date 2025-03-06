package PredefinedClassObjectCreating;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestConfig {
	
	@Bean
	public Object o() {
		return new Object();
	}
	
	@Bean
	public List<String> boys() {
		List<String> l = new ArrayList<String>();
		l.add("Vicky");
		l.add("Dinesh");
		l.add("Loki");
		return l;
	}
	
	@Bean
	public Set<Integer> contact() {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(987654321);
		s.add(123456789);
		s.add(987456321);
		return s;
	}
	
	@Bean
	public Map<Integer, String> details() {
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(1, "Kong 🐵🐵🐵");
		m.put(2, "Godzilla 🐲🐲🐲");
		return m;
	}
}
