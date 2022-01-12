package com.injection;

import java.util.Date;

public class EmployeeDetails{
	int eno;
	String ename;
	Date doj;
	Date dob;
	Date dom;

	public EmployeeDetails(int eno, String ename, Date doj, Date dob, Date dom) {
		System.out.println("EmployeeDetails.EmployeeDetails()");
		this.eno = eno;
		this.ename = ename;
		this.doj = doj;
		this.dob = dob;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [eno=" + eno + ", ename=" + ename + ", doj=" + doj + ", dob=" + dob + ", dom=" + dom
				+ "]";
	}
}