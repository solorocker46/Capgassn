package com.cg.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Author;

public class AuthorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Author a = new Author();
		/*a.setAuthorId(102);
		a.setFirstName("Aishwarya");
		a.setMiddleName("U");
		a.setLastName("K");
		a.setPhoneNo("7790996545");*/
		System.out.println("Enter author id");
		int id = scanner.nextInt();
		Author a1 = em.find(Author.class, id);
		if(a1 == null)
		{
			System.out.println("No author details found");
		}
		else
		{
			System.out.println(a1);
		}
		//em.persist(a);
		em.getTransaction().commit();
	}

}
