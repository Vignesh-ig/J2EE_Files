package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	try {
		//6-1-->5
		Person p=new Person();
		p.setName("Vignesh");
		p.setAge(23);
		p.setGender("male");
		p.setPhone(94874765);
		
		//5-1-->4
        AadhaarCard a=new AadhaarCard();
        a.setAno(23456);
        a.setAddress("perambur");
        a.setDob("07-11-2001");
        a.setPerson(p);
        
        p.setAadhaarcard(a);
        
        et.begin();
        em.persist(a);
        em.persist(p);
        et.commit();
	}catch (Exception e) {
		e.printStackTrace();
		et.rollback();
	}
  }
}
