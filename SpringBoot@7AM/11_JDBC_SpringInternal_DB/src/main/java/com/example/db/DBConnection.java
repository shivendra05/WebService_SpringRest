package com.example.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements CommandLineRunner {
	public final String getRowCount="insert into MYDB values (5,'ABC',5.5)";
	public final String updateRowByID="update MYDB set age=55 where id=5";
	public final String deleteRowByID="delete from MYDB where id=5";
	

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