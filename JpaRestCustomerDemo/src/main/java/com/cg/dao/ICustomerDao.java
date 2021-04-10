package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;

@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer>{
	List<Customer> findByLname(String lname);
}
