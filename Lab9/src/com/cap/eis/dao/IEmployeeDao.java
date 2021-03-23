package com.cap.eis.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.cap.eis.bean.Department;
import com.cap.eis.bean.Employee;

public interface IEmployeeDao {
	double getSumOfSalary(List<Employee> elist);
	Map<String, Long> getDeptNamesAndCount(List<Employee> elist);
	Employee getSeniorEmployee(List<Employee> elist);
	List<String> getDuration(List<Employee> elist);
	List<Employee> getEmployeesWithoutDepartment(List<Employee> elist);
	List<Employee> getEmployeesWithoutManager(List<Employee> elist);
	List<String> getSalaryIncrease15(List<Employee> elist);
	List<Employee> getSortedListById(List<Employee> elist);
	List<Employee> getSortedListByName(List<Employee> elist);
	List<Employee> getSortedListByDepartment(List<Employee> elist);
	List<Department> getDeptsWithoutEmployees(List<Employee> elist, List<Department> dlist);
	List<String> getEmployeeStartDetails(List<Employee> elist);
	List<String> getEmployeeStartFriday(List<Employee> elist);
	List<String> getEmployeeAndManager(List<Employee> elist);
	Map<Department, Long> getDeptHighestCount(List<Employee> elist);
}
