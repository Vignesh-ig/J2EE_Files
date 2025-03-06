package product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.*;

public class FetchAllData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Products p");
		
		List<Products> l = q.getResultList();
		
		for (Products products : l) {
			System.out.println(products);
		}
	}
}
