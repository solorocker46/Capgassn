package com.cg.day1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class NamedQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createNamedQuery("findAll");
		List l = q.getResultList();
		System.out.println(l);
		
		System.out.println("==============Named Query - findallbyid============");
		Query q1 = em.createNamedQuery("findAllById").setParameter("id", 1);
		Student s1 = (Student)q1.getSingleResult();
		System.out.println("Id = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Dept = "+s1.getDept());
		
		System.out.println("==============Named Query - findallbyid with typedquery============");
		TypedQuery<Student> q2 = em.createNamedQuery("findAllById", Student.class).setParameter("id", 1);
		//Single result will give only one result
		//getResultList will give more than 1 rows.
		Student s2 = (Student)q2.getSingleResult();
		System.out.println("Id = "+s2.getId());
		System.out.println("Name = "+s2.getName());
		System.out.println("Dept = "+s2.getDept());
		
		System.out.println("==============Named Query - findallbyid1 with typedquery - to get id > given id============");
		TypedQuery<Student> q3 = em.createNamedQuery("findAllById1", Student.class).setParameter("id", 3);
		List<Student> sl = (List<Student>)q3.getResultList();
		for(Student s : sl)
		{
			System.out.println(s);
		}
		em.getTransaction().commit();
	}

}
