package com.bean.cfgs;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("time")
	public LocalTime getTime() {
		return LocalTime.now();
	}
}