package com.cap.eis.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cap.eis.bean.Employee;
import com.cap.eis.dao.EmployeeDao;
import com.cap.eis.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao employeedao = new EmployeeDao();
	@Override
	public double getSumOfSalary(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getSumOfSalary(elist);
	}

	@Override
	public Map<String, Long> getDeptNamesAndCount(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getDeptNamesAndCount(elist);
	}

	@Override
	public Employee getSeniorEmployee(List<Employee> elist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getDuration(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getDuration(elist);
	}

	@Override
	public List<Employee> getEmployeesWithoutDepartment(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeesWithoutDepartment(elist);
	}

	@Override
	public List<Employee> getEmployeesWithoutManager(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeesWithoutManager(elist);
	}

	@Override
	public List<String> getSalaryIncrease15(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getSalaryIncrease15(elist);
	}

	@Override
	public List<Employee> getSortedListById(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getSortedListById(elist);
	}

	@Override
	public List<Employee> getSortedListByName(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getSortedListByName(elist);
	}

	@Override
	public List<Employee> getSortedListByDepartment(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getSortedListByDepartment(elist);
	}

	@Override
	public List<String> getEmployeeStartDetails(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeeStartDetails(elist);
	}

	@Override
	public List<String> getEmployeeStartFriday(List<Employee> elist) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeeStartFriday(elist);
	}

	
}
