package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Id ");
	    int id=sc.nextInt();
	    System.out.println("Enter address ");
	    String add=sc.next();
	    
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    EntityManager em=emf.createEntityManager();
	    EntityTransaction et=em.getTransaction();
	    
	    Passengers c=em.find(Passengers.class,id);
	    if(c!=null) {
	    	c.setAddress(add);
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
