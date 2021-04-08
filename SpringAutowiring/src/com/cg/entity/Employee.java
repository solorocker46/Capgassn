package com.cg.entity;

public class Employee {
	String name;
	Address addr;
	Vehicle vehicle;
	public Employee()
	{
		
	}
	public Employee(Address addr, Vehicle vehicle) {
		super();
		this.addr = addr;
		this.vehicle = vehicle;
		System.out.println("2-arg");
	}
	public Employee(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
		System.out.println("1-arg");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void displayDetails()
	{
		System.out.println("Name = "+name);
		addr.myaddress();
		vehicle.myvehicle();
	}
}
