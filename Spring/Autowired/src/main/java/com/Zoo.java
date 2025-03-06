package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("zoo")
public class Zoo {

	@Autowired
	Animal kong;

	@Autowired
	Animal godzilla;

	@Autowired
	@Qualifier("k")// it is used to get multiple object and store in different reference
	Animal animal;

	public void getAnimal() {
		kong.getAnimal();
		godzilla.getAnimal();
		System.out.println("------------------");
		animal.getAnimal();
	}
}
