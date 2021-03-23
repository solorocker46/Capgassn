package com.cap.service;

import com.cap.bean.Product;
import com.cap.dao.IProductDao;
import com.cap.dao.ProductDAOImpl;
import com.cap.exception.IdException;

public class ProductServiceImpl implements IProductService {
	IProductDao productDao = new ProductDAOImpl();
	@Override
	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductByID(id);
	}
	@Override
	public Product getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(category);
	}

}
