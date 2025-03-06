package hotels;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateFoodData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.print("Enter primary key : ");
		int p_key = sc.nextInt();
		Food h = em.find(Food.class, p_key);

		if (h != null) {
			System.out.println("Enter food name");
			sc.nextLine();
			h.setFname(sc.nextLine());
			System.out.println("Enter food price");
			double price = sc.nextDouble();
			h.setFprice(price);
			System.out.println("Enter food type");
			String type = sc.nextLine();
			h.setFtype(type);
			et.begin();
			em.merge(h);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Data Not Found");
		}
	}
}