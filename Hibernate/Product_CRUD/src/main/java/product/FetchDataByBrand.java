package product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataByBrand {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Products p where p.brand='Levis'");
		
		Object o = q.getSingleResult();
		Products p = (Products) o;
		
		System.out.println(p);
		
	}
}
