package hotels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			Food f1 = new Food();
			f1.setFname("Chicken Zinger");
			f1.setFprice(349);
			f1.setFtype("Non-Veg");
			
			Food f2 = new Food();
			f2.setFname("Veg Zinger");
			f2.setFprice(249);
			f2.setFtype("Veg");
			
			Food f3 = new Food();
			f3.setFname("Hot and Chrispy");
			f3.setFprice(449);
			f3.setFtype("Non-Veg");
			
			Food f4 = new Food();
			f4.setFname("Chicken Popcorn");
			f4.setFprice(169);
			f4.setFtype("Non-Veg");
			
			List<Food> f = new ArrayList<Food>();
			f.add(f1);
			f.add(f2);
			f.add(f3);
			f.add(f4);
			
			Hotel hotel = new Hotel();
			hotel.setHname("KFC");
			hotel.setHloc("70 feet road, Thiru.vi.ka nagar");
			hotel.setFoods(f);
			
			et.begin();
			em.persist(hotel);
			em.persist(f1);
			em.persist(f2);
			em.persist(f3);
			em.persist(f4);
			et.commit();
			
			System.out.println("Data Saved");
			
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
	}

}
