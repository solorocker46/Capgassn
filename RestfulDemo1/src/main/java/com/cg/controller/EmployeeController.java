package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;

@RestController
//RequestMapping is used to add this as a part of the url
@RequestMapping("/employeeApi")
public class EmployeeController {
	List<Employee> empList;
	public EmployeeController() {
		empList = new ArrayList<>();
		empList.add(new Employee(1, "Rahul", 50000, "Developer"));
		empList.add(new Employee(2, "Sachin", 60000, "HR"));
		empList.add(new Employee(3, "Ravi", 45000, "Tester"));
	}
	
	//http://localhost:8034/employeeApi/employeeList
	//GetMapping will add this value mentioned to the url
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployeeList()
	{
		return empList;
	}
	
	//@PathVariable will take empid from url given in postman and will take that as a parameter into the method
	//http://localhost:8034/employeeApi/getEmployeeById/3
	//3 will be passed to the method as a parameter
	@GetMapping(value = "/getEmployeeById/{empid}")
	public Employee getByEmployeeId(@PathVariable int empid)
	{
		Employee e = null;
		for(Employee emp : empList)
		{
			if(emp.getId() == empid)
			{
				e = emp;
			}
		}
		return e;
	}
	
	//http://localhost:8034/employeeApi/addNewEmployee
	//Select post, go to body, choose json format, add details of employee and click send
	@PostMapping(value = "/addNewEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp)
	{
		empList.add(emp);
		return new ResponseEntity<Object>("Successfully added", HttpStatus.OK);
	}
	
	
	/*
	 * Can do like this also instead of ResponseEntity
	 * But ResponseEntity is better as response codes and messages will be used in angular
	public String addEmployee2(@RequestBody Employee emp)
	{
		empList.add(emp);
		return "New Employee Added";
	}
	*/
	
	//http://localhost:8034/employeeApi/deleteEmployeeById/2
	//Choose DELETE instead of GET
	@DeleteMapping(value = "/deleteEmployeeById/{empid}")
	public ResponseEntity<Object> deleteEmployeeById(@PathVariable int empid)
	{
		Employee e;
		for(Employee emp : empList)
		{
			if(emp.getId() == empid)
			{
				empList.remove(emp);
			}
		}
		return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
	}
}
