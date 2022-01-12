package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.entity.Employee_Department;
import com.example.entity.Employee_DepartmentRowMapper;

@Component
public class EmployeeDetails implements CommandLineRunner{
	private final static String getAllEmployeeDetails="Select * from Employee_Department";

	@Autowired
	JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		Employee_DepartmentRowMapper mapper= new Employee_DepartmentRowMapper();

		List<Employee_Department> listEmp=  jt.query(getAllEmployeeDetails, mapper);

		for (Employee_Department emp:listEmp ) {
			System.out.println(emp);			
		}
	}
}
