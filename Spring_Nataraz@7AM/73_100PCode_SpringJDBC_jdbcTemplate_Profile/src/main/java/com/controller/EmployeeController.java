package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.EmployeeService;

@Controller("controller")
public class EmployeeController{
	@Autowired
	EmployeeService service;
	

	public int getEmpNo() throws Exception {
		
		return service.getempCount();
	}
}