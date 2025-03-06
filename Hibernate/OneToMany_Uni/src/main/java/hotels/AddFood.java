package hotels;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddFood {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hotel h = em.find(Hotel.class, 1);
		
		if (h != null) {
			Food f1 = new Food();
			f1.setFname("Smoky Grilled");
			f1.setFprice(599);
			f1.setFtype("Non-Veg");
			
			List<Food> l = h.getFoods();
			l.add(f1);
			
			et.begin();
			em.persist(f1);
			em.merge(h);
			et.commit();
			
			System.out.println("Data Saved");
		} else {
			System.out.println("Hotel Not Found");
		}
	}

}
