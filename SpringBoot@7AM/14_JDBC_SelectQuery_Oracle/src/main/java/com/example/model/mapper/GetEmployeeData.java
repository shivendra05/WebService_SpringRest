package com.example.model.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class GetEmployeeData implements CommandLineRunner {

	private final static String getAllEemp = "select * from Employee_Department;";
	@Autowired
	JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		EmployeeMapper mapper = new EmployeeMapper();
		List<Employee> listEmp =  jt.query(getAllEemp, mapper);

		for (Employee emp: listEmp) {
			System.out.println(emp);			
		}
	}
}