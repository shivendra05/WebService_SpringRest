package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		EmployeeController emp=null;
		ApplicationContext ctx= null;
		int empEntriesCoutn=0;
		//create IOC container
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		//get bean class
		emp = ctx.getBean("controller",EmployeeController.class);
		empEntriesCoutn = emp.getEmpNo();
		System.out.println("Total Entries on DB for EMployee are: "+empEntriesCoutn);
		
		((AbstractApplicationContext) ctx).close();
	}
}