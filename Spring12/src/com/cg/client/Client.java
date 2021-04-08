package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.entity.Employee;
import com.cg.entity.SBU;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println("Employee details = "+emp);
		SBU sbu = emp.getSbuDetails();
		System.out.println("SBU details = "+sbu);
	}

}
