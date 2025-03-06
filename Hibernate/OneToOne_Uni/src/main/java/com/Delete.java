package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=em.find(Person.class, 1);
		
		if(p!=null) {
			Address a=p.getA();
			
			et.begin();
			em.remove(p);
			em.remove(a);
			et.commit();
		}
		else {
			System.out.println("Data Not Found");
		}
}
}