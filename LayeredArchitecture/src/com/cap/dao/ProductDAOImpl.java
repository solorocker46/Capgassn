package com.cap.dao;

import java.util.Map;

import com.cap.bean.Product;
import com.cap.util.CollectionUtil;

public class ProductDAOImpl implements IProductDao {
	CollectionUtil collectionutil = new CollectionUtil(); 
	@Override
	public Product getProductByID(int id) {
		Map<Integer, Product> hashMap = collectionutil.getProduct();
		Product p = hashMap.get(id);
		return p;
	}

	@Override
	public Product getProductByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByCategory(String category) {
		// TODO Auto-generated method stub
		Map<String, Product> hashMap = collectionutil.getProduct1();
		Product p = hashMap.get(category);
		return p;
	}

}
