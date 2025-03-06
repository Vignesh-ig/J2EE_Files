package hotels;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllHotels {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select h from Hotel h");
		
		List<Hotel> l = q.getResultList();
		
		for (Hotel hotel : l) {
			System.out.println(hotel);
		}
	}

}
