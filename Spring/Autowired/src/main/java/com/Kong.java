package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("kong")
@Qualifier("k")
public class Kong implements Animal {

	@Override
	public void getAnimal() {
		System.out.println("I AM KONG 🐵🐵🐵 ");
	}
}
