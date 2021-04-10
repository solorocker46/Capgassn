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
import com.cg.exception.IdNotFoundException;
import com.cg.exception.PriceException;
import com.cg.service.IProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//http://localhost:8036/swagger-ui.html#
//Swagger url

@Api("Product Controller")
@RestController
@RequestMapping(value = "/product")
public class Controller {
	
	@Autowired
	IProductService service;
	
	@ApiOperation(value = "Add new product")
	@PostMapping(value = "/addProduct")
	public ResponseEntity<Object> addProduct(@RequestBody Product p)
	{
		try
		{
			service.addProduct(p);
			return new ResponseEntity<Object>("Successfully added", HttpStatus.OK);
		}
		catch(PriceException e)
		{
			throw new PriceException("Price should be > 0");
		}
	}
	
	@GetMapping(value = "/getAllProduct")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	
	@GetMapping(value = "/getProductById/{pid}")
	public Product getProductById(@PathVariable int pid)
	{
		try
		{
			return service.getProductById(pid);
		}
		catch(IdNotFoundException e)
		{
			throw new IdNotFoundException("Id not found");
		}
	}
	
	@DeleteMapping(value = "/deleteProductById/{pid}")
	public ResponseEntity<Object> deleteProductById(@PathVariable int pid)
	{
		try
		{
			service.deleteProductById(pid);
			return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
		}
		catch(IdNotFoundException e)
		{
			throw new IdNotFoundException("No id found to delete");
		}
	}
}
