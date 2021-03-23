package com.cap.service;

import com.cap.bean.Product;

public interface IProductService {
	Product getProductByID(int id);
	Product getProductByCategory(String category);
}
