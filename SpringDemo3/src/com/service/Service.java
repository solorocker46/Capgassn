package com.service;

import com.dao.IDao;

public class Service implements IService{

	IDao dao;
	@Override
	public void viewConnectWay() {
		// TODO Auto-generated method stub
		dao.connect();
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
