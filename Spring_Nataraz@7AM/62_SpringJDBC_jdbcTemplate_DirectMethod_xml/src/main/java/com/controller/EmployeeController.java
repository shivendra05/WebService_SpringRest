package com.controller;

import java.util.List;
import java.util.Map;

import com.service.EmployeeService;

public class EmployeeController{
	EmployeeService service;

	EmployeeController(EmployeeService service){
		this.service=service;
	}

	public int getEmpNo() throws Exception {
		return service.getempCount();
	}

	public String getEmpName(int eno) throws Exception {
		return service.getEmpName(eno);
	}
	
	public List getEmpDetails() throws Exception {
		return service.getEmpDetails();
	}
	
	public Map<String, Object> getEmp(int eno) throws Exception {
		return service.getEmp(eno);
	}
}