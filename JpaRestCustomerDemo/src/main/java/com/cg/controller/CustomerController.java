package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer cust)
	{
		service.addCustomer(cust);
		return new ResponseEntity<Object>("Successfully added", HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllCustomer")
	public List<Customer> getAllCustomer()
	{
		return service.getAllCustomer();
	}
	
	@GetMapping(value = "/getCustomerById/{cid}")
	public Customer getCustomerById(@PathVariable int cid) 
	{
		return service.getCustomerById(cid);
	}
	
	@DeleteMapping(value = "/deleteCustomerById/{cid}")
	public ResponseEntity<Object> deleteCustomerById(@PathVariable int cid)
	{
		service.deleteCustomerById(cid);
		return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
	}
	
	@GetMapping(value = "/getCustomerByLastName/{lname}")
	public List<Customer> getCustomerByLastName(@PathVariable String lname)
	{
		return service.getCustomerByLastName(lname);
	}
}
