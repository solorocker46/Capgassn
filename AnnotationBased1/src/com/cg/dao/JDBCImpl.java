package com.cg.dao;

import org.springframework.stereotype.Component;

@Component
public class JDBCImpl implements IDao {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting through jdbc");
	}

}
