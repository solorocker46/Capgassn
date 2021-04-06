package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;
import com.cg.entity.Manager;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Manager mgr = new Manager();
		mgr.setMgrid(101);
		mgr.setMgrName("Rahul");
		
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setName("Suresh");
		e1.setSalary(40000);
		e1.setMgr(mgr);
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setName("Ramesh");
		e2.setSalary(60000);
		e2.setMgr(mgr);
		
		em.persist(e1);
		em.persist(e2);
		System.out.println("Records inserted successfully...");
		em.getTransaction().commit();
	}

}
