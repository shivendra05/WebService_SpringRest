package com.example.details;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp")
public class EmployeeDetails implements CommandLineRunner {
	
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [dept=" + dept + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Employee");
		System.out.println(this);
	}
}