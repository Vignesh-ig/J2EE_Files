
package com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByStudentName {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter the Name");
		String name=sc.next();
		
		Query q=em.createQuery("select a from Student a where a.name=?1");
		q.setParameter(1,name );
		
		List<Student> l=q.getResultList();
		Object o = q.getSingleResult();
		Student s = (Student) o;
		
		System.out.println(s);
	}
}
