package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Product;

@Service
public interface IProductService {
	Product addProduct(Product p);
	List<Product> getAllProduct();
	Product getProductById(int pid);
	void deleteProductById(int pid);
}
