package com.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.dao")
public class dao_bean {

	@Bean
	public DataSource hikariDataSoruce() {
		HikariDataSource hDataSource=null;
		hDataSource = new HikariDataSource();
		
		hDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hDataSource.setUsername("system");
		hDataSource.setPassword("shiv");
		hDataSource.setMinimumIdle(10);
		hDataSource.setIdleTimeout(20000);
		
		return hDataSource;
	}
}
