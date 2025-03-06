package hotels;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchFoodByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
				
		Query q = em.createQuery("select f from Food f where f.fname='Veg Zinger'");
		
		Object o = q.getSingleResult();
		Food f = (Food) o;
		
		System.out.println(f);
		
	}
}
