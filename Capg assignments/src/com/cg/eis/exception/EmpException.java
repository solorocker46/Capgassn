package com.cg.eis.exception;

import java.util.Scanner;

class EmployeeException extends Exception
{
	public EmployeeException(String msg)
	{
		super(msg);
	}
}
class Employee
{
	void checkSalary(int salary) throws EmployeeException
	{
		if(salary >= 3000)
		{
			System.out.println("Salary = "+salary);
		}
		else
		{
			throw new EmployeeException("Your salary is "+salary+" which is below 3000");
		}
	}
}
public class EmpException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		Employee emp = new Employee();
		try
		{
			emp.checkSalary(salary);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
