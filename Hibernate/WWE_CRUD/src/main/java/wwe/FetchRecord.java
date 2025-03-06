package wwe;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rank");
		int prank = sc.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		 
		Query q = em.createQuery("select w from WWE w where w.prank = ?1 ");
		q.setParameter(1, prank);
		
		Object o = q.getSingleResult();
		
		WWE w = (WWE)o;
		
		System.out.println(w);
	}
}
