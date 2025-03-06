package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch2 {
	//1st level cache memory -- EntityManager level memory -- reduce database interaction from 8 to 4
	
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
		
		em1.find(Person.class, 2);
		em1.find(Person.class, 2);
		
		
	}
}
