package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.ServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cg");
		context.refresh();
		
		ServiceImpl ser = (ServiceImpl) context.getBean("ServiceImpl");
		ser.myDisplay();
	}

}
