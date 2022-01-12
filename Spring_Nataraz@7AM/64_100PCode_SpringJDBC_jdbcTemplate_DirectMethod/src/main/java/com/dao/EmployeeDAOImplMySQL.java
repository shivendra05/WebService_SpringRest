package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImplMySQL implements EmployeeDAO {
	public static final String GET_EMP_COUNT="Select count(*) from Employee_Department";
	@Autowired
	JdbcTemplate template;

	@Override
	public int getEmployeeCount() throws Exception {
		System.out.println(template.getClass().getName());
		int totalEnties=0;
		totalEnties = template.queryForObject(GET_EMP_COUNT, Integer.class);

		return totalEnties;
	}
}