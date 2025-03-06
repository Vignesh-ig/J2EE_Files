package wwe;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class PlayerRanking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.println("Enter Rank");
		int rank = sc.nextInt();
		System.out.println("Enter Player name");
		String name = sc.next();
		System.out.println("Enter player age");
		int age = sc.nextInt();
		
		WWE w = new WWE();
		w.setPrank(rank);
		w.setName(name);
		w.setAge(age);
	
		et.begin();
		em.persist(w);
		et.commit();
		
		System.out.println("Data Saved");
		
	}
}
