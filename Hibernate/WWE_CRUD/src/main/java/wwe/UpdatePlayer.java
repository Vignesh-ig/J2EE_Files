package wwe;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdatePlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		System.out.println("Enter rank number");
		int prank = sc.nextInt();
		WWE w = em.find(WWE.class, prank);

		if (w != null) {
			w.setName("Bigg Show");
			et.begin(); 
			em.merge(w);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Data Not Found");
		}
	}

}
