package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddPassengers {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Passengers h=em.find(Passengers.class, 1);
				Passengers f1=new Passengers();
				f1.setName("siddhu");
				f1.setAddress("Chennai");
				f1.setMobile(6432);
				f1.setTrain(h.getTrain());
				
				et.begin();
				em.persist(f1);
				et.commit();
				
				System.out.println("Data Saved");
	
		
}
}
