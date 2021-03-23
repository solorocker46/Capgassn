package com.cg.eis.pl;

import java.util.Map;
import java.util.Scanner;

import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.IEmployeeService;

import com.cg.eis.bean.*;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IEmployeeService service = new EmployeeService();
		Map<Integer, Employee> empDetails = Repository.getEmployee();
		System.out.println("Enter your choice");
		System.out.println("1. View Employee details based on insurance scheme\t2. Delete an employee\t3. Display all employee details");
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			System.out.println("Input the insurance scheme");
			scanner.nextLine();
			String insuranceScheme = scanner.nextLine();
			System.out.println(service.displayEmployeeDetails(empDetails, insuranceScheme));
		}
		else if(choice == 2)
		{
			System.out.println("Input employee id to delete");
			int id = scanner.nextInt();
			service.deleteEmployeeDetails(empDetails, id);
		}
		else if(choice == 3)
		{
			System.out.println("Employee details");
			service.displayDetails(empDetails);
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}

}
