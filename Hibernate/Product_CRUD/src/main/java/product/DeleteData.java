package product;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();

		Products p = em.find(Products.class, id);

		if (p != null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Data Not Found");
		}
	}
}
