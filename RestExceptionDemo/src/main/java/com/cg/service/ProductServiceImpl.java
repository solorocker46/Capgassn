package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IProductDao;
import com.cg.entity.Product;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.PriceException;

@Service
public class ProductServiceImpl implements IProductService {

	//This is used to automatically inject object dependency
	@Autowired
	IProductDao dao;
	
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		if(p.getPrice() <= 0)
		{
			throw new PriceException();
		}
		return dao.save(p);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		if(dao.existsById(pid))
		{
			return dao.findById(pid).get();
		}
		else
		{
			throw new IdNotFoundException();
		}
	}

	@Override
	public void deleteProductById(int pid) {
		// TODO Auto-generated method stub
		if(dao.existsById(pid))
			dao.deleteById(pid);
		else
		{
			throw new IdNotFoundException();
		}
	}
	
}
