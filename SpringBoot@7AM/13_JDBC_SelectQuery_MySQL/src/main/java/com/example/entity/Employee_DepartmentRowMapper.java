package com.example.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Employee_DepartmentRowMapper implements RowMapper<Employee_Department>{

	public Employee_Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee_Department dept = new Employee_Department();
		
		dept.setEno(rs.getInt(1));
		dept.setEname(rs.getString(2));
		dept.setJob_title(rs.getString(3));
		dept.setSal(rs.getFloat(4));
		dept.setDeptNo(rs.getInt(5));
		
		return dept;
	}
}
