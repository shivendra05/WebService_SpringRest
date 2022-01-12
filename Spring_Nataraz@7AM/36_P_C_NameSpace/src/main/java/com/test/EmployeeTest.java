package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=null;
		ApplicationContext ctx= null;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");

		emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		
		((AbstractApplicationContext) ctx).close();
	}
}