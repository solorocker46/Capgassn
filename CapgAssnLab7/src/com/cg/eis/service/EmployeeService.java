package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeService implements IEmployeeService{

	@Override
	public List<Employee> displayEmployeeDetails(Map<Integer, Employee> empList, String insuranceScheme) {
		List<Employee> resList = new ArrayList<>();
		for(Map.Entry<Integer, Employee> entry : empList.entrySet())
		{
			Employee emp = entry.getValue();
			if(emp.getInsuranceScheme().equals(insuranceScheme))
			{
				resList.add(emp);
			}
		}
		return resList;
	}

	@Override
	public void deleteEmployeeDetails(Map<Integer, Employee> empList, int empId) {
		// TODO Auto-generated method stub
		empList.remove(empId);
	}

	@Override
	public void displayDetails(Map<Integer, Employee> empList) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Employee> entry : empList.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	
	

}
