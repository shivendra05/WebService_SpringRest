package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	public static final String GET_EMP_COUNT="Select count(*) from Employee_Department";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int getEmployeeCount() throws Exception {
		int totalEnties=0;
		totalEnties = jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return totalEnties;
	}
}