package com.bo;

import java.io.Serializable;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class EmployeeBO implements Serializable{
	private Integer empNo;
	private String ename;
	private String job;
	private Float sal;
	private Integer deptNo;
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "EmployeeBO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptNo="
				+ deptNo + "]";
	}
}