package com.cfgs;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;


@Configuration
@ComponentScan(basePackages = "com.dao")
public class DAO_Bean {

	@Bean
	@Profile("test")
	public DataSource getHikariConnection() {
		HikariDataSource hds= null;
		hds = new HikariDataSource();
		System.out.println(hds.getClass().getName());
		hds.setUsername("system");
		hds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hds.setPassword("shiv");
		hds.setMaximumPoolSize(20);
		hds.setMinimumIdle(1000);
		return hds;
	}

	@Bean
	@Profile("test")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getHikariConnection());
	}

	@Bean
	@Profile("uat")
	public BasicDataSource getDhcpConnection() {
		BasicDataSource bds= null;
		bds = new BasicDataSource();
		System.out.println(bds.getClass().getName());
		bds.setUsername("system");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setPassword("shiv");

		return bds;
	}

	@Bean
	@Profile("uat")
	public JdbcTemplate getdhcpTemplate() {
		return new JdbcTemplate(getDhcpConnection());
	}

	@Bean
	@Profile("prod")
	public DataSource getMySQLDhcpConnection() {
		BasicDataSource bds= null;
		bds = new BasicDataSource();
		System.out.println(bds.getClass().getName());
		bds.setUsername("root");
		bds.setUrl("jdbc:mysql:///shivdata");
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setPassword("shiv");

		return bds;
	}

	@Bean
	@Profile("prod")
	public JdbcTemplate getMYSQLdhcpTemplate() {
		return new JdbcTemplate(getMySQLDhcpConnection());
	}
}