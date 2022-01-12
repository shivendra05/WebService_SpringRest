package com.beans;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("per")
@ConfigurationProperties("per.info")
public class PersonDetails {

	int id;
	String name;
	int age;
	Set<String> ifsc;
	Map<String, Long> account;
	DepartmentDetails details;
}
	