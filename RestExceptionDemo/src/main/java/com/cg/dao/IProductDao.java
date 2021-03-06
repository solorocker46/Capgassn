package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Repository
public interface IProductDao extends JpaRepository<Product, Integer>{
	
}
