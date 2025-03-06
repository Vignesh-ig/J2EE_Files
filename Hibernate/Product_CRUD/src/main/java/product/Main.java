package product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Products p = new Products();
		p.setId(4);
		p.setPname("Belt");
		p.setBrand("Tommy Hilfiger");
		p.setPrice(12000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p);
		et.commit();
		
		System.out.println("Data Saved");
	}

}
