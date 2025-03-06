package hotels;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteFoodById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();

		Food f = em.find(Food.class, id);

		if (f != null) {
			et.begin();
			em.remove(f);
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Data Not Found");
		}
	}

}
