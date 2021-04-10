package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeDao;
import com.cg.entity.Trainee;
import com.cg.exception.FieldEmptyException;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.NameNotFoundException;

@Service
public class TraineeServiceImpl implements ITraineeService{

	@Autowired
	ITraineeDao dao;
	
	@Override
	public Trainee addTrainee(Trainee e) {
		// TODO Auto-generated method stub
		if(e.getTraineeId() <= 0 || e.getTraineeName() == "" || e.getTraineeDomain() == "" || e.getTraineeLocation() == "")
		{
			throw new FieldEmptyException();
		}
		else
		{
			return dao.save(e);
		}
		
	}

	@Override
	public List<Trainee> findAllTrainee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Trainee findTraineeByName(String traineeName) {
		// TODO Auto-generated method stub
		Trainee trainee = dao.findByTraineeName(traineeName);
		if(trainee == null)
		{
			throw new NameNotFoundException();
		}
		else
		{
			return trainee;
		}
	}

	@Override
	public Trainee findTraineeById(int traineeId) {
		// TODO Auto-generated method stub
		if(dao.existsById(traineeId))
		{
			return dao.findById(traineeId).get();
		}
		else
		{
			throw new IdNotFoundException();
		}
	}

	@Override
	public void deleteTraineeById(int traineeId) {
		// TODO Auto-generated method stub
		if(dao.existsById(traineeId))
		{
			dao.deleteById(traineeId);
		}
		else
		{
			throw new IdNotFoundException();
		}
	}

	@Override
	public Trainee updateTraineeById(int traineeId, Trainee trainee) {
		// TODO Auto-generated method stub
		if(dao.existsById(traineeId))
		{
			Trainee tr = dao.findById(traineeId).get();
			tr.setTraineeDomain(trainee.getTraineeDomain());
			tr.setTraineeLocation(trainee.getTraineeLocation());
			return dao.save(tr);
		}
		else
		{
			throw new IdNotFoundException();
		}
	}


}
