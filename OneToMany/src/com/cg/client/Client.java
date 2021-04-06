package com.cg.client;
import com.cg.entity.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.cg.entity.Department;
import com.cg.entity.Employee;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setName("Suresh");
		e1.setSalary(40000);
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setName("Ramesh");
		e2.setSalary(60000);
		
		List<Employee> elist = new ArrayList<>();
		elist.add(e1);
		elist.add(e2);
		
		Department dept = new Department();
		dept.setDeptId(100);
		dept.setDeptName("HR");
		dept.setElist(elist);
		
		
		em.persist(dept);
		System.out.println("Records inserted successfully...");
		em.getTransaction().commit();
	}

}
