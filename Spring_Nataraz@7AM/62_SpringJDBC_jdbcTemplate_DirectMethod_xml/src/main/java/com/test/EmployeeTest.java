package com.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		EmployeeController emp=null;
		ApplicationContext ctx= null;
		int empEntriesCoutn=0;
		String empName=null;
		Scanner sn =null;
		List empDetails=null;
		//create IOC container
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		//get bean class
		emp = ctx.getBean("controller",EmployeeController.class);
		System.out.println("-------------Get Employee Count-------------------");
		empEntriesCoutn = emp.getEmpNo();
		System.out.println("Total Entries on DB for EMployee are: "+empEntriesCoutn);
		
		System.out.println("-------------Get Employee Name-------------------");
		sn =new Scanner(System.in);
	    System.out.println("Enter Emp No. ");
		empName = emp.getEmpName(sn.nextInt());
		System.out.println("Employee Name: "+empName);
		
		System.out.println("-------------Get Employee Details-------------------");
		empDetails = emp.getEmpDetails();
		empDetails.forEach(list->System.out.println(list));
		
		System.out.println("-------------Get Employee-------------------");
		sn =new Scanner(System.in);
	    System.out.println("Enter Emp No. ");
	    Map obj =emp.getEmp(sn.nextInt());
		System.out.println(obj);
		((AbstractApplicationContext) ctx).close();
	}
}