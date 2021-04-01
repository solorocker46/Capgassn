package ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entity.Product;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("select p from Product p");
		List<Product> p = q.getResultList();
		System.out.println(p);
		
		System.out.println("=============Using named query - findAll=============");
		Query q1 = em.createNamedQuery("findAll");
		List<Product> p1 = q1.getResultList();
		System.out.println(p1);
		
		System.out.println("=============Using named query - findById=============");
		Query q2 = em.createNamedQuery("findById").setParameter("id", 3);
		Product prod = (Product) q2.getSingleResult();
		System.out.println(prod);
		
		System.out.println("=============Using named query - findById - TypedQuery=============");
		TypedQuery<Product> q3 = em.createNamedQuery("findById", Product.class).setParameter("id", 5);
		Product prod1 = q3.getSingleResult();
		System.out.println(prod1);
		
		System.out.println("=============Aggregate queries=============");
		Query q4 = em.createQuery("select max(p.price) from Product p");
		int maxval = (int)q4.getSingleResult();
		System.out.println(maxval);
		
		System.out.println("================Native query============");
		Query q5 = em.createNativeQuery("select * from product40", Product.class);
		List<Product> all = q5.getResultList();
		for(Product pr : all)
		{
			System.out.println(pr);
		}
		

		System.out.println("================Native query to display proce > 20000============");
		Query q6 = em.createNativeQuery("select * from product40 where price > 20000", Product.class);
		List<Product> price20 = q6.getResultList();
		for(Product pr : price20)
		{
			System.out.println(pr);
		}
		
		System.out.println("=============Using named query - findSalary>20000=============");
		TypedQuery<Product> q7 = em.createNamedQuery("findByPrice", Product.class).setParameter("price", 20000);
		List<Product> val = q7.getResultList();
		for(Product pr : val)
		{
			System.out.println(pr);
		}
		em.getTransaction().commit();
	}

}
