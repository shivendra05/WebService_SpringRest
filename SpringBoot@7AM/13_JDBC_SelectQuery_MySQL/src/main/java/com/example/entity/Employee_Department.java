package com.example.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee_Department implements Serializable{

	private int eno;
	private String ename;
	private String job_title;
	private Float sal;
	private int deptNo;
	
}
