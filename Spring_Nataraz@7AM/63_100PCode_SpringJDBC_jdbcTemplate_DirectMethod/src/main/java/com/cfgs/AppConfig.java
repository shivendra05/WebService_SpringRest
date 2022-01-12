package com.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({DAO_Bean.class,Service_Bean.class,Controller_Bean.class})
public class AppConfig {
	
}