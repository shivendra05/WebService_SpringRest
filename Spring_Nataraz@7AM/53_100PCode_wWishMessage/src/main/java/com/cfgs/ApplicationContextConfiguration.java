package com.cfgs;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.beans")
public class ApplicationContextConfiguration {
	
	@Bean
	public Date getDate() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
}