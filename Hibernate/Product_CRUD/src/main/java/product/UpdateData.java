package product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Products p = em.find(Products.class, 1);

		if (p != null) {
			p.setPrice(99999);
			et.begin(); 
			em.merge(p);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Data Not Found");
		}
	}
}
