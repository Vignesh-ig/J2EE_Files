package product;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataUsingPostionalParameter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		System.out.print("Enter product name : ");
		String name = sc.next();
		
		Query q = em.createQuery("select p from Products p where p.pname = ?1");
		q.setParameter(1, name);
		
		Object o = q.getSingleResult();
		
		Products p = (Products) o;
		System.out.println(p);
		
	}

}
