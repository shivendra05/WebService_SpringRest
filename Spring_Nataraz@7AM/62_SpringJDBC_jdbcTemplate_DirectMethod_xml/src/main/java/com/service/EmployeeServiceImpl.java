package com.service;

import java.util.List;
import java.util.Map;

import com.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDAO dao;

	EmployeeServiceImpl(EmployeeDAO dao){
		this.dao=dao;
	}

	@Override
	public int getempCount() throws Exception {

		return dao.getEmployeeCount();
	}

	@Override
	public String getEmpName(int eno) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeNameByID(eno);
	}

	@Override
	public List getEmpDetails() throws Exception {
		return dao.getEmployeeDetails();
	}

	@Override
	public Map<String, Object> getEmp(int eno) throws Exception {
		return dao.getEmployee(eno);
	}
}