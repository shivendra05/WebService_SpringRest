package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.controller.EmployeeController;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= null;
		EmployeeController empController =null;
		int empCount=0;
		ctx = SpringApplication.run(Application.class, args);
		empController = ctx.getBean("controller",EmployeeController.class);
		empCount = empController.getEmpNo();
		System.out.println("No of employee are in the table:: "+empCount);
	}
}