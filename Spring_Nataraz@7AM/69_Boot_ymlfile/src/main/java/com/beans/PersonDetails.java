package com.beans;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("per")
@ConfigurationProperties("per.info")
public class PersonDetails {
	//@Value("${per.info.id}")
	int id;
	//@Value("${per.info.name}")
	String name;
	//@Value("${per.info.age}")
	int age;
	Set<String> ifsc;
	Map<String, Long> account;
	DepartmentDetails details;
}
	