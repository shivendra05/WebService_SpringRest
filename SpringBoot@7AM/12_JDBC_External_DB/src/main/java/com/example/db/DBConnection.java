package com.example.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements CommandLineRunner {
	public final String getRowCount="insert into Employee_Department values (112, 'Mishra JI', 'Developer', 8573.02,4)";
	public final String updateRowByID="update Employee_Department set deptNo=5 where eno=110";
	public final String deleteRowByID="delete from Employee_Department where eno=110";

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		int count = jt.update(getRowCount);
		System.out.println(count);
		
		int updatedRow = jt.update(updateRowByID);
		System.out.println(updatedRow);
		
		int deletedRow = jt.update(deleteRowByID);
		System.out.println(deletedRow);
	}
}