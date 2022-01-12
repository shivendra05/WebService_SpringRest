package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.cfgs.AppConfig;
import com.controller.EmployeeController;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		EmployeeController emp=null;
		AnnotationConfigApplicationContext ctx= null;
		int empEntriesCoutn=0;
		//create IOC container
		ctx= new AnnotationConfigApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		env.setActiveProfiles("uat");
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		//get bean class
		emp = ctx.getBean("controller",EmployeeController.class);
		empEntriesCoutn = emp.getEmpNo();
		System.out.println("Total Entries on DB for EMployee are: "+empEntriesCoutn);

		((AbstractApplicationContext) ctx).close();
	}
}