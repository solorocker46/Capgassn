package com.cg.eis.pl;
import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.*;
public class Repository {
	public static Map<Integer, Employee> getEmployee()
	{
		Map<Integer, Employee> empDetails = new HashMap<>();
		empDetails.put(3, new Employee(3, "Sushma S", 80000, "Manager", "Scheme A"));
		empDetails.put(10, new Employee(10, "Ashish Chawla", 35000, "Programmer", "Scheme B"));
		empDetails.put(2, new Employee(2, "Siddharth Bharadwaj", 76000, "Manager", "Scheme A"));
		empDetails.put(1, new Employee(1, "Namratha", 15000, "System Associate", "Scheme C"));
		empDetails.put(9, new Employee(9, "Jai V", 37000, "Programmer", "Scheme B"));
		empDetails.put(25, new Employee(25, "Prithvi Acharya", 25000, "Programmer", "Scheme B"));
		return empDetails;
	}
}
