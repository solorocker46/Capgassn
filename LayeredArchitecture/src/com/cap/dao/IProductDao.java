package com.cap.dao;

import com.cap.bean.Product;

public interface IProductDao {
	Product getProductByID(int id);
	Product getProductByPrice(int price);
	Product getProductByCategory(String category);
}
