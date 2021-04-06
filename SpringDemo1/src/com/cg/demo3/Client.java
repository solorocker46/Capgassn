package com.cg.demo3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationcontext.xml"); 
		BeanFactory factory = new XmlBeanFactory(resource);
		Student stud = (Student) factory.getBean("s");
		stud.displayDetails();
	}

}
