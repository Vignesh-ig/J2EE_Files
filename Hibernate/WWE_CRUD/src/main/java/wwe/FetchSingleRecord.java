package wwe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchSingleRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		 
		Query q = em.createQuery("select w from WWE w where w.name = 'roman reigns' ");
		
		Object o = q.getSingleResult();
		
		WWE w = (WWE)o;
		
		System.out.println(w);
	}

}
