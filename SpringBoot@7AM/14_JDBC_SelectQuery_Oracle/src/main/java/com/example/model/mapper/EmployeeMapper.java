package com.example.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		rs.getInt(1);
		rs.getString(2);
		rs.getString(3);
		rs.getFloat(4);
		rs.getInt(5);
		return emp;
	}
}