package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Trainee;

@Service
public interface ITraineeService {
	Trainee addTrainee(Trainee e);
	List<Trainee> findAllTrainee();
	Trainee findTraineeByName(String traineeName);
	Trainee findTraineeById(int traineeId);
	void deleteTraineeById(int traineeId);
	Trainee updateTraineeById(int traineeId, Trainee trainee);
}
