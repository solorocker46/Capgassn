package com.cap.eis.pl;

import com.cap.eis.bean.Employee;
import com.cap.eis.service.EmployeeService;
import com.cap.eis.service.IEmployeeService;

import java.util.*;

public class EmpMain {
	public static void main(String args[])
	{
		 IEmployeeService es=new EmployeeService();
		 List<Employee> elist=EmployeeRepository.getEmployee();
		 System.out.println("Sum of the Salary: "+es.getSumOfSalary(elist));
		 
		 System.out.println("\n----------Employee without dept :----------------- ");
		 List<Employee> el2=es.getEmployeesWithoutDepartment(elist);
		 el2.forEach(System.out::println);

		 System.out.println("\n----------------Employee without manager : --------------------");
		 List<Employee> el3=es.getEmployeesWithoutManager(elist);
		 el3.forEach(System.out::println);

		 System.out.println("\n------------Employee salary increased by 15%----------");
		 List<String> el4=es.getSalaryIncrease15(elist);
		 el4.forEach(System.out::println);

		 System.out.println("\n-------------List sorted by First Name----------");
		 List<Employee> el5=es.getSortedListByName(elist);
		 el5.forEach(System.out::println);

		 System.out.println("\n-------------List sorted by Employee id----------");
		 List<Employee> el6=es.getSortedListById(elist);
		 el6.forEach(System.out::println);

		 System.out.println("\n-------------List sorted by Department id----------");
		 List<Employee> el7=es.getSortedListByDepartment(elist);
		 el7.forEach(System.out::println);
		 
		 System.out.println("\n-------------Employee names and their duration----------");
		 List<String> el8=es.getDuration(elist);
		 el8.forEach(System.out::println);
		 
		 System.out.println("\n-------------Employee names and their hire date with day of the week----------");
		 List<String> el9 = es.getEmployeeStartDetails(elist);
		 el9.forEach(System.out::println);
		 
		 System.out.println("\n-------------Employee names and their hire date with day of the week = Friday----------");
		 List<String> el10 = es.getEmployeeStartFriday(elist);
		 el10.forEach(System.out::println);
		 
		 System.out.println("\n-------------Department names and the count of employees in each department----------");
		 Map<String, Long> el11 = es.getDeptNamesAndCount(elist);
		 for(Map.Entry<String, Long> entry : el11.entrySet())
		 {
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 
	}
}
