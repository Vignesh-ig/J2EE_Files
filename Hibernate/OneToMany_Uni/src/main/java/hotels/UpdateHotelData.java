package hotels;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotelData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.print("Enter primary key : ");
		int p_key = sc.nextInt();
		Hotel h = em.find(Hotel.class, p_key);

		if (h != null) {
			System.out.print("Enter Hotel Name");
			sc.nextLine();
			h.setHname(sc.nextLine());
			System.out.print("Enter Hotel Location");
			h.setHloc(sc.nextLine());
			et.begin();
			em.merge(h);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Data Not Found");
		}
	}
}
