package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.IProductDao;
import com.cg.entity.Product;

@SpringBootApplication
public class SpringBootJpaDemoApplication implements CommandLineRunner{

	@Autowired
	IProductDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello....");
		Product p1 = new Product(4, "mobile", "electronics", 20000);
		System.out.println("======Saved=====");
		dao.save(p1);
		System.out.println("To find first id");
		Optional<Product> opt = dao.findById(3);
		if(opt.isPresent())
		{
			System.out.println(opt.get().getId());
			System.out.println(opt.get().getName());
			System.out.println(opt.get().getCategory());
			System.out.println(opt.get().getPrice());
		}
		else
		{
			System.out.println("Not found");
		}
		
		System.out.println("======findall==============");
		List<Product> prodlist = dao.findAll();
		prodlist.forEach(s->System.out.println(s));
		
		System.out.println("============deleteById=============");
		//dao.deleteById(2);
		
		System.out.println("=========findByNAme=============");
		Product prod = dao.findByName("laptop");
		System.out.println(prod);
		
		System.out.println("===========findByCategory=================");
		List<Product> productlist = dao.findByCategory("electronics");
		productlist.forEach(s->System.out.println(s));
		
		System.out.println("============findByNameAndCategory===========");
		Product p2 = dao.findByNameAndCategory("mobile", "electronics");
		System.out.println(p2);
		
		System.out.println("===========findByCategoryStartingWith================");
		List<Product> plist = dao.findByCategoryStartingWith("e");
		plist.forEach(s->System.out.println(s));
	}

}
