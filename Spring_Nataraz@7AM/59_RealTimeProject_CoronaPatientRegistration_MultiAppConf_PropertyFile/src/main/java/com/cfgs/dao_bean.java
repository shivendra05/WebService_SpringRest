package com.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.dao")
@PropertySource("classpath:/com/commons/app.properties")
public class dao_bean {
	
	@Autowired
	Environment env;
	
	@Bean("hDS")
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
	
	
	@Bean("hDSProp")
	public DataSource hikariDataSoruceProperties() {
		HikariDataSource hDataSource=null;
		hDataSource = new HikariDataSource();
		
		hDataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverName"));
		hDataSource.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		System.out.println("uName::"+env.getRequiredProperty("jdbc.userName"));
		hDataSource.setUsername(env.getRequiredProperty("jdbc.userName"));
		System.out.println("Password::"+env.getRequiredProperty("jdbc.pws"));
		hDataSource.setPassword(env.getRequiredProperty("jdbc.pws"));
		hDataSource.setMinimumIdle(10);
		hDataSource.setIdleTimeout(20000);
		
		return hDataSource;
	}
	
	
}
