package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

public class SBU {
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private ArrayList<Employee> empList;
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}
	
}
