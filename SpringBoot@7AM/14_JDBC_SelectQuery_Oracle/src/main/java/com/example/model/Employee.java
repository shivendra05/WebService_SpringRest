package com.example.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

	private int ENO;
	private String ENAME;
	private String JOB_TITLE;
	private float SAL;
	private int	DEPTNO; 
}
