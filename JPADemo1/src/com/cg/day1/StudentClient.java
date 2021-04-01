package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student s = new Student();
		s.setId(14);
		s.setName("Sushma");
		s.setDept("CSE");
		em.persist(s);
		
		Student s1 = new Student();
		s1.setId(15);
		s1.setName("Sneha MJ");
		s1.setDept("CSE");
		em.persist(s);
		em.persist(s1);
		System.out.println("Record inserted .... ");
		em.getTransaction().commit();
		em.close();
	}

}
