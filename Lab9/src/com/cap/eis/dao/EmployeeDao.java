package com.cap.eis.dao;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.cap.eis.bean.Department;
import com.cap.eis.bean.Employee;

public class EmployeeDao implements IEmployeeDao {

	@Override
	public double getSumOfSalary(List<Employee> elist) {
		// TODO Auto-generated method stub
		double salarySum = elist.stream().mapToDouble(e->e.getSalary()).sum();
		return salarySum;
	}

	@Override
	public Map<String, Long> getDeptNamesAndCount(List<Employee> elist) {
		// TODO Auto-generated method stub
		Map<String, Long> empMap = elist.stream().filter(e->e.getDep() != null).collect(Collectors.groupingBy(e->e.getDep().getDepartmentName(), Collectors.counting()));
		return empMap;
	}

	@Override
	public Employee getSeniorEmployee(List<Employee> elist) {
		// TODO Auto-generated method stub
		//Employee seniorEmployee = elist.stream().map(e->Period.between(e.getLocalDate(), LocalDate.now()).getDays()).max();
		return null;
	}

	@Override
	public List<String> getDuration(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<String> empList = elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+Period.between(e.getLocalDate(), LocalDate.now()).getMonths()+" Months "+Period.between(e.getLocalDate(), LocalDate.now()).getDays()+" Days").collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<Employee> getEmployeesWithoutDepartment(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<Employee> empList = elist.stream().filter(e->e.getDep() == null).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<Employee> getEmployeesWithoutManager(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<Employee> empList = elist.stream().filter(e->e.getManagerId() == null).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<String> getSalaryIncrease15(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<String> salList = elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getSalary()*1.5).collect(Collectors.toList());
		return salList;
	}

	@Override
	public List<Employee> getSortedListById(List<Employee> elist) {
		// TODO Auto-generated method stub
		Comparator<Employee> idComparator = (e1, e2) ->
		{
			if(e1.getEmployeeId() == e2.getEmployeeId())
				return 0;
			else if(e1.getEmployeeId() > e2.getEmployeeId())
				return 1;
			else
				return -1;
		};
		List<Employee> empList = elist.stream().sorted(idComparator).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<Employee> getSortedListByName(List<Employee> elist) {
		// TODO Auto-generated method stub
		Comparator<Employee> nameComparator = (e1, e2) ->
		{
			return e1.getFirstName().compareTo(e2.getFirstName());
		};
		List<Employee> empList = elist.stream().sorted(nameComparator).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<Employee> getSortedListByDepartment(List<Employee> elist) {
		// TODO Auto-generated method stub
		Comparator<Employee> deptComparator = (e1, e2) ->
		{
			return e1.getDep().getDepartmentName().compareTo(e2.getDep().getDepartmentName());
		};
		List<Employee> empList = elist.stream().filter(e->e.getDep() != null).sorted(deptComparator).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<Department> getDeptsWithoutEmployees(List<Employee> elist, List<Department> dlist) {
		// TODO Auto-generated method stub
		//List<Department> depList = dlist.stream().filter((d,e)->d.getDepartmentId() != )
		return null;
	}

	@Override
	public List<String> getEmployeeStartDetails(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<String> empList = elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getLocalDate()+" "+e.getLocalDate().getDayOfWeek()).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<String> getEmployeeStartFriday(List<Employee> elist) {
		// TODO Auto-generated method stub
		List<String> empList = elist.stream().filter(e->e.getLocalDate().getDayOfWeek().toString().equals("FRIDAY")).map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getLocalDate()+" "+e.getLocalDate().getDayOfWeek()).collect(Collectors.toList());
		return empList;
	}

	@Override
	public List<String> getEmployeeAndManager(List<Employee> elist) {
		// TODO Auto-generated method stub
		//List<String> empMgrList = elist.stream().filter(e->e.getManagerId()!= null).map(e->e.getFirstName()+" "+e.getLastName()+" reports to ").map(e->e.concat(e.)).collect(Collectors.toList());
		return null;
	}

	@Override
	public Map<Department, Long> getDeptHighestCount(List<Employee> elist) {
		// TODO Auto-generated method stub
		Map<Department, Long> highest = elist.stream().filter(e->e.getDep() != null).collect(Collectors.groupingBy(e->e.getDep(), Collectors.counting()));
		return null;
	}


}
