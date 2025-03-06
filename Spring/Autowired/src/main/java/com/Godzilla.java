package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("godzilla")
@Qualifier("g")
public class Godzilla implements Animal{

	@Override
	public void getAnimal() {
		System.out.println("I AM GODZILLA 🐲🐲🐲 ");
		
	}
	
	
}
