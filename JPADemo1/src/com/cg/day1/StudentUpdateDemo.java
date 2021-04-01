package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student stud = em.find(Student.class, 1);
		if(stud != null)
		{
			//System.out.println("Before update.....");
			System.out.println("Student id = "+stud.getId());
			System.out.println("Name = "+stud.getName());
			System.out.println("Dept = "+stud.getDept());
			/*stud.setName("Sid");
			stud.setDept("CSE");
			System.out.println("After update .... ");
			System.out.println("Student id = "+stud.getId());
			System.out.println("Name = "+stud.getName());
			System.out.println("Dept = "+stud.getDept());*/
		}
		else
		{
			System.out.println("No object found");
		}
		Student stud1 = em.find(Student.class, 5);
		em.remove(stud1);
		em.getTransaction().commit();
	}

}
