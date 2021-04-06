package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.AppConfig;
import com.cg.entity.Employee;

public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = (Employee) context.getBean("e");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		Employee emp1 = (Employee) context.getBean("e1");
		emp1.setId(2);
		emp1.setName("Kumar");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		
		Employee e2 = (Employee) context.getBean("e2");
		e2.display();
	}

}
