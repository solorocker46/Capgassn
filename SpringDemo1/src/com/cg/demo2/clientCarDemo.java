package com.cg.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class clientCarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationcontextCar.xml"); 
		BeanFactory factory = new XmlBeanFactory(resource);
		Car car = (Car) factory.getBean("c");
		car.displayCarDetails();
	}

}
