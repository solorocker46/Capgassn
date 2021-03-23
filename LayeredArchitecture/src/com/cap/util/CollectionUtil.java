package com.cap.util;
import java.util.*;

import com.cap.bean.Product;
public class CollectionUtil {
	private static Map<Integer, Product> products = new HashMap<>();
	private static Map<String, Product> products1 = new HashMap<>();
	static
	{
		products.put(100, new Product(100, "Laptop", "Electronics", 78000));
		products.put(101, new Product(101, "Mobile", "MobileElectronics", 60000));
		products.put(102, new Product(102, "T-shirt", "Clothes", 1000));
	}
	static
	{
		products1.put("Electronics", new Product(100, "Laptop", "Electronics", 78000));
		products1.put("MobileElectronics", new Product(101, "Mobile", "MobileElectronics", 60000));
		products1.put("Clothes", new Product(102, "T-shirt", "Clothes", 1000));
	}
	public static Map<Integer, Product> getProduct()
	{
		return products;
	}
	public static Map<String, Product> getProduct1()
	{
		return products1;
	}
}
