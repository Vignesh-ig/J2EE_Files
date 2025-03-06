package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// 5-1--->4
		Address a = new Address();

		a.setArea("Vadapalani");
		a.setDistrict("Chennai");
		a.setState("Tamil Nadu");
		a.setPincode(637103);

		// 6-1--->5
		Person p = new Person();
		p.setName("Suriya");
		p.setAge(25);
		p.setGender("Male");
		p.setPhone(34567875);
		p.setA(a);

		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
	}
}
