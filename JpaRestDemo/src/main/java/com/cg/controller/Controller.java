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

import com.cg.entity.Product;
import com.cg.service.IProductService;

@RestController
@RequestMapping(value = "/product")
public class Controller {
	
	@Autowired
	IProductService service;
	
	@PostMapping(value = "/addProduct")
	public ResponseEntity<Object> addProduct(@RequestBody Product p)
	{
		service.addProduct(p);
		return new ResponseEntity<Object>("Successfully added", HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllProduct")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	
	@GetMapping(value = "/getProductById/{pid}")
	public Product getProductById(@PathVariable int pid)
	{
		
			return service.getProductById(pid);
		
	}
	
	@DeleteMapping(value = "/deleteProductById/{pid}")
	public ResponseEntity<Object> deleteProductById(@PathVariable int pid)
	{
		service.deleteProductById(pid);
		return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
	}
}
