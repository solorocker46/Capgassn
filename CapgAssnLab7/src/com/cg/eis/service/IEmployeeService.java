package com.cg.eis.service;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.*;

public interface IEmployeeService {
	List<Employee> displayEmployeeDetails(Map<Integer, Employee> empList, String insuranceScheme);
	void deleteEmployeeDetails(Map<Integer, Employee> empList, int empId);
	void displayDetails(Map<Integer, Employee> empList);
}
