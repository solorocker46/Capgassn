package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer10")
public class Customer {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String contactNo;
	private int rewards;
	public Customer() {
		
	}
	public Customer(int id, String fname, String lname, String contactNo, int rewards) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.contactNo = contactNo;
		this.rewards = rewards;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getRewards() {
		return rewards;
	}
	public void setRewards(int rewards) {
		this.rewards = rewards;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname =" + lname +", contactNo=" + contactNo + ", rewards=" + rewards + "]";
	}
	
}
