package com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchById {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		
		Query q=em.createQuery("select a from Address a where a.id=?1");
		q.setParameter(1,id );
		
		List<Address> l=q.getResultList();
		
		for(Address c:l) {
			System.out.println(c);
		}
}
}
