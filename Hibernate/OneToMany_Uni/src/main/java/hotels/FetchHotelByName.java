package hotels;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchHotelByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
				
		Query q = em.createQuery("select h from Hotel h where h.hname='KFC'");
		
		Object o = q.getSingleResult();
		Hotel h = (Hotel) o;
		
		System.out.println(h);
		
	}
}
