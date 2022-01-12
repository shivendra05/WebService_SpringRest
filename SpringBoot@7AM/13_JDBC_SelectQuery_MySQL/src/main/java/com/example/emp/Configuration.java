package com.example.emp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import com.zaxxer.hikari.HikariDataSource;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public DataSource getConnection() {
		HikariDataSource hds=null;
		
		hds = new HikariDataSource();
		
		hds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hds.setUsername("root");
		hds.setPassword("shiv");
		hds.setJdbcUrl("jdbc:mysql:///shivdata");
		
		return hds;
		
	}
	
}




