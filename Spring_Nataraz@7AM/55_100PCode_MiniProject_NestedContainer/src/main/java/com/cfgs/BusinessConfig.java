package com.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.dao,com.service")
public class BusinessConfig {

	@Bean("Hikari")
	public DataSource hikariDataSoruce() {
		HikariDataSource hDataSource=null;
		hDataSource =new  HikariDataSource();

		hDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hDataSource.setUsername("system");
		hDataSource.setPassword("shiv");
		hDataSource.setIdleTimeout(20000);
		hDataSource.setMaximumPoolSize(20);
		hDataSource.setMinimumIdle(10);
		return hDataSource;
	}
}