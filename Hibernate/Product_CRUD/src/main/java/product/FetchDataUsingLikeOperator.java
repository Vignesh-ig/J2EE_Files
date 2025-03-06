package product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataUsingLikeOperator {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Products p where p.brand like '%l%'");
		
		List<Products> l = q.getResultList();
		
		for (Products products : l) {
			System.out.println(products);
		}
	}
}
