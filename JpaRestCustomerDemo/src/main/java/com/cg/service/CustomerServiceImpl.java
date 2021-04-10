package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;
import com.cg.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDao dao;

	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return dao.save(cust);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lname) {
		// TODO Auto-generated method stub
		return dao.findByLname(lname);
	}

}
