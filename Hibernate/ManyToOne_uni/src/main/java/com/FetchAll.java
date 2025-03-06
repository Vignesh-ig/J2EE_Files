package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select h from Passengers h");
		
		List<Passengers> l=q.getResultList();
		System.out.println(l);
		
//		for(Passengers c:l) {
//			System.out.println(c);
//		}
	}
}
