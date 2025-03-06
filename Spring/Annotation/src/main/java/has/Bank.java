package has;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class Bank {
	
	@Autowired
	SBI s;
	
	public void getBalance() {
		System.out.println(s.bal);
	}
}
