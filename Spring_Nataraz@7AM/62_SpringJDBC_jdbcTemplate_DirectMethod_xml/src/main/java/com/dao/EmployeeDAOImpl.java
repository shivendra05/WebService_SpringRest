package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.aso.e;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static final String GET_EMP_COUNT="Select count(*) from Employee_Department";
	public static final String GET_EMP_NAME="Select ename from Employee_Department where eno=?";
	public static final String GET_EMP_DETAILS="Select * from Employee_Department";
	public static final String GET_EMP="Select ENAME, JOB_TITLE,SAL from Employee_Department where eno=?";
	JdbcTemplate template;
	EmployeeDAOImpl(JdbcTemplate template){
		this.template=template;
	}

	@Override
	public int getEmployeeCount() throws Exception {
		int totalEnties=0;
		totalEnties = template.queryForObject(GET_EMP_COUNT, Integer.class);

		return totalEnties;
	}

	@Override
	public String getEmployeeNameByID(int eno) throws Exception {
		String empName = null;
		empName = template.queryForObject(GET_EMP_NAME, String.class,eno);
		
		return empName;
	}

	@Override
	public List getEmployeeDetails() throws Exception {
		List empList = null;
		empList = template.queryForList(GET_EMP_DETAILS);
		return empList;
	}

	@Override
	public Map<String, Object> getEmployee(int eno) throws Exception {
		Map<String, Object> mapEmp=null;
		mapEmp = template.queryForMap(GET_EMP, eno);
		// TODO Auto-generated method stub
		return mapEmp;
	}
}