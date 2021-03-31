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
		s.setId(2);
		s.setName("Rahul");
		s.setDept("Mechanical");
		em.persist(s);
		System.out.println("Record inserted .... ");
		em.getTransaction().commit();
		em.close();
	}

}
