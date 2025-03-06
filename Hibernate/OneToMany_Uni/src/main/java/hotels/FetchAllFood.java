package hotels;

import java.util.List;

import javax.persistence.*;

public class FetchAllFood {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select f from Food f");
		
		List<Food> l = q.getResultList();
		
		for (Food f : l) {
			em.remove(l);
//			System.out.println(f);
		}
	}

}
