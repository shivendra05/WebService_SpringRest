package com.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan(basePackages = "com.replacer")
@ImportResource("com/cfgs/applicationContext.xml")
public class AppConfig {

	
	
	
}
