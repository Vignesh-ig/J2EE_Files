package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch3 {
	//2nd level cache memory -- EntityManagerFactory level memory -- 1st level will reduce database interaction from 8 to 4 -- 2nd level will reduce 4 to 8
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		
		em1.find(Person.class, 1);
		em1.find(Person.class, 1);
		em1.find(Person.class, 1);
		
		em1.find(Person.class, 1);
		em1.find(Person.class, 1);
		em2.find(Person.class, 1);
		em2.find(Person.class, 1);
		
		
		
		
	}
}
