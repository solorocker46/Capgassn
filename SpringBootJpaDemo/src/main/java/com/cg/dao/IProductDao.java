package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Repository
public interface IProductDao extends JpaRepository<Product, Integer>{
	List<Product> findByCategory(String category);
	Product findByName(String name);
	Product findByNameAndCategory(String name, String category);
	List<Product> findByCategoryStartingWith(String name);
}
