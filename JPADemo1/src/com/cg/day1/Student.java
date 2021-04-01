package com.cg.day1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student30")
@NamedQuery(name = "findAll", query = "select s from Student s")
@NamedQueries(
		{
			@NamedQuery(name = "findAll1", query = "select s from Student s"),
			@NamedQuery(name = "findAllById", query = "select s from Student s where s.id = :id"),
			@NamedQuery(name = "findAllById1", query = "select s from Student s where s.id > :id")
		}
		)
public class Student {
	@Id
	private int id;
	private String name;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
