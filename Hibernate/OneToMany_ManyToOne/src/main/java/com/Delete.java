package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Staff s = em.find(Staff.class, 1);

		if (s != null) {
			List<Student> f = s.getStudent();

			et.begin();
			em.remove(s);
			et.commit();
			
			System.out.println("Data Deleted");
		} else {
			System.out.println("Data Not Found");
		}
	}
}
