package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Trainee;
import com.cg.exception.FieldEmptyException;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.NameNotFoundException;
import com.cg.service.ITraineeService;

@RestController
@RequestMapping(value = "/trainee")
public class TraineeController {
	@Autowired
	ITraineeService service;
	
	@PostMapping(value = "/addTrainee")
	public ResponseEntity<Object> addTrainee(@RequestBody Trainee e)
	{
		try
		{
			service.addTrainee(e);
			return new ResponseEntity<>("Added successfully", HttpStatus.OK);
		}
		catch(FieldEmptyException exception)
		{
			throw new FieldEmptyException("Fields are empty");
		}
	}
	
	@GetMapping(value = "/findAllTrainee")
	public List<Trainee> findAllTrainee()
	{
		return service.findAllTrainee();
	}
	
	@GetMapping(value = "/findTraineeByName/{traineeName}")
	public Trainee findTraineeByName(@PathVariable String traineeName)
	{
		try
		{
			return service.findTraineeByName(traineeName);
		}
		catch(NameNotFoundException exception)
		{
			throw new NameNotFoundException("Entered name doesn't exist");
		}
	}
	
	@GetMapping(value = "/findTraineeById/{traineeId}")
	public Trainee findTraineeById(@PathVariable int traineeId)
	{
		try
		{
			return service.findTraineeById(traineeId);
		}
		catch(IdNotFoundException exception)
		{
			throw new IdNotFoundException("Id doesn't exist");
		}
	}
	
	@DeleteMapping(value = "/deleteTraineeById/{traineeId}")
	public ResponseEntity<Object> deleteTraineeById(@PathVariable int traineeId)
	{
		try
		{
			service.deleteTraineeById(traineeId);
			return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
		}
		catch(IdNotFoundException exception)
		{
			throw new IdNotFoundException("Id doesn't exist");
		}
	}
	
	@PutMapping(value = "/updateTraineeById/{traineeId}")
	public ResponseEntity<Object> updateTraineeById(@PathVariable int traineeId, @RequestBody Trainee trainee)
	{
		try
		{
			service.updateTraineeById(traineeId, trainee);
			return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
		}
		catch(IdNotFoundException exception)
		{
			throw new IdNotFoundException("Id doesn't exist");
		}
	}
	
}
