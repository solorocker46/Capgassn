package com.cap.client;

import java.util.Scanner;

import com.cap.bean.Product;
import com.cap.service.IProductService;
import com.cap.service.ProductServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IProductService productService = new ProductServiceImpl();
		System.out.println("Enter the product id");
		int productid = scanner.nextInt();
		System.out.println("Enter the quantity");
		int quantity = scanner.nextInt();
		Product product = productService.getProductByID(productid);
		int totalPrice = 0;
		if(product != null)
		{
			System.out.println("Product found");
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getCategory());
			System.out.println(product.getPrice());
			product.setQuantity(quantity);
			totalPrice = product.getQuantity() * product.getPrice();
			System.out.println("Total price = "+totalPrice);
			
		}
		else
		{
			System.out.println("No product found");
		}
		System.out.println("Enter product category");
		String category = scanner.next();
		Product product1 = productService.getProductByCategory(category);
		if(product1 != null)
		{
			System.out.println("Product found");
			System.out.println(product1.getProductId());
			System.out.println(product1.getProductName());
			System.out.println(product1.getCategory());
			System.out.println(product1.getPrice());
			product1.setQuantity(quantity);
			totalPrice = product1.getQuantity() * product1.getPrice();
			System.out.println("Total price = "+totalPrice);
			
		}
		else
		{
			System.out.println("No product found");
		}
	}

}
