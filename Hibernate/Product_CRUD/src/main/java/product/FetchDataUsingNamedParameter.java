package product;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataUsingNamedParameter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		System.out.print("Enter start price range : ");
		double start = sc.nextDouble();
		System.out.print("Enter end price range  : ");
		double end = sc.nextDouble();

		Query q = em.createQuery("select p from Products p where p.price between :start and :end order by p.price");
		q.setParameter("start", start);
		q.setParameter("end", end);

		List<Products> l = q.getResultList();

		for (Products products : l) {
			System.out.println(products);
		}
	}
}
