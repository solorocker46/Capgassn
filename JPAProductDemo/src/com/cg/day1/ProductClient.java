package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Product p = new Product();
		p.setId(1);
		p.setName("Mobile");
		p.setPrice(30000);
		p.setCategory("Electronics");
		em.persist(p);
		System.out.println("Row inserted ... ");
		em.getTransaction().commit();
	}

}
