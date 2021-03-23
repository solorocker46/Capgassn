package com.cap.eis.pl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.cap.eis.bean.*;

public class EmployeeRepository {
	private static List<Department> dlist = new ArrayList<>();
	private static List<Employee> elist = new ArrayList<>();
	static
	{
		dlist.add(new Department(10,"IT",100));
		dlist.add(new Department(20,"Sales",101));
		dlist.add(new Department(30,"Marketing",102));
		dlist.add(new Department(40,"HR",104));
	}
	static
	{
		elist.add(new Employee(100,"Ram","Kumar","ram@cg.com","9444566981",LocalDate.of(2012,5,25),"President",50000.00,null,new Department(10,"IT",100)));
		elist.add(new Employee(104,"Sham","Narayan","sham@cg.com","9651234580",LocalDate.of(2015,8,2),"Sales_Mgr",45000.00,100,null));
		elist.add(new Employee(105,"Krishna","Kumar","kkr@cg.com","8541562349",LocalDate.of(2015,8,2),"Sales_Mgr",45000.00,null,new Department(20,"Sales",101)));
		elist.add(new Employee(101,"Vinod","Malhotra","vinod@cg.com","7863214020",LocalDate.of(2015,8,2),"Sales_Mgr",45000.00,100,new Department(40,"Sales",101)));
		elist.add(new Employee(102,"Zaheer","Khan","zhk@cg.com","6998523642",LocalDate.of(2011,7,21),"Marketing",15000.00,100,new Department(30,"Marketing",102)));
		elist.add(new Employee(103,"Smriti","Patil","smriti@cg.com","962569632",LocalDate.of(2010,8,2),"Sales_Mgr",45000.00,100,null));
		elist.add(new Employee(106,"Vinay","Deshpande","deshpande@cg.com","6542391020",LocalDate.of(2015,8,2),"Sales_Mgr",45000.00,100,new Department(20,"Sales",101)));
	}
	public static List<Department> getDepartments()
	{
		return dlist;
	}
	public static List<Employee> getEmployee()
	{
		return elist;
	}
}
