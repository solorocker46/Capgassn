package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Customer;

@Service
public interface ICustomerService {
	Customer addCustomer(Customer cust);
	List<Customer> getAllCustomer();
	Customer getCustomerById(int id);
	void deleteCustomerById(int id);
	List<Customer> getCustomerByLastName(String lname);
}
