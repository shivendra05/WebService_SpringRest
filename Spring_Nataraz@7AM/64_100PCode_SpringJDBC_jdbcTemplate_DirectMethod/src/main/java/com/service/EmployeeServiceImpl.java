package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDAO dao;

	@Override
	public int getempCount() throws Exception {
		
		return dao.getEmployeeCount();
	}
}