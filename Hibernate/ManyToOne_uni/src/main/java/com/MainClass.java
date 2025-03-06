package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Train t=new Train();
	t.setTid(12345);
	t.setName("Chennai Express");
	t.setBoarding("Chennai");
	t.setDesignation("Mumbai");
	
	Passengers p1=new Passengers();
	p1.setAddress("BLR");
	p1.setName("Rakavi");
	p1.setMobile(764323);
	p1.setTrain(t);
	
	Passengers p2=new Passengers();
	p2.setAddress("Madurai");
	p2.setName("Sowmi");
	p2.setMobile(7696523);
	p2.setTrain(t);
	
	et.begin();
	em.persist(t);
	em.persist(p2);
	em.persist(p1);
	et.commit();
	
	System.out.println("Data Saved");
}
}
