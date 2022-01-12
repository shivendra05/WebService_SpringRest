package com.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;


@Configuration
@ComponentScan(basePackages = "com.dao")
public class DAO_Bean {

	@Bean("ds")
	public DataSource getDbConnection() {
		HikariDataSource hds= null;
		hds = new HikariDataSource();

		hds.setUsername("system");
		hds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hds.setPassword("shiv");

		return hds;
	}
	
	@Bean("jt")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDbConnection());
	}
}