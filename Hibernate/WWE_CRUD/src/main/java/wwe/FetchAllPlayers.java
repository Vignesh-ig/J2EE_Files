package wwe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPlayers {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		 
		Query q = em.createQuery("select w from WWE w");
		
		List<WWE> l = q.getResultList();
		
		for (WWE w : l) {
			System.out.println(w);
		}
	}

}
