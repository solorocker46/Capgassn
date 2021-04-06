package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Address;
import com.cg.entity.Employee;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Address ad = new Address();
		ad.setAddressId(100);
		ad.setStreetName("BTM");
		ad.setPincode(567890);
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Rahul");
		e1.setSalary(45000);
		e1.setDesg("HR");
		e1.setAddress(ad);
		em.persist(e1);
		System.out.println("Records inserted successfully...");
		em.getTransaction().commit();
	}

}
