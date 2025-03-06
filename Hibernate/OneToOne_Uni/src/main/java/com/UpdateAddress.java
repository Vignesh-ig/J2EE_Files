package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAddress {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Id ");
	    int id=sc.nextInt();
	    System.out.println("Enter Area ");
	    String area=sc.next();
	    
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    EntityManager em=emf.createEntityManager();
	    EntityTransaction et=em.getTransaction();
	    
	    Address c=em.find(Address.class,id);
	    if(c!=null) {
	    	c.setArea(area);
	    	et.begin();
	    	em.merge(c);
	    	et.commit();
	    	System.out.println("Data Updated");
	    }
	    else {
	    	System.out.println("Data Not Found");
	    }
	    
	}
}
