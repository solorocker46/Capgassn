package com.cg.day1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("select s from Student s");
		List l = q.getResultList();
		System.out.println(l);
		
		System.out.println("Using typed query");
		
		TypedQuery<Student> q1 = em.createQuery("select s from Student s", Student.class);
		List<Student> ll = q1.getResultList();
		em.getTransaction().commit();
	}

}
