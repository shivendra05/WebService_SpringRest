package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BankService;

public class BankServiceLoggingTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx= null;
		BankService bankService=null;
		float result= 0.0f;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/ApplicationConext.xml");
		
		bankService = ctx.getBean("service",BankService.class);
		result = bankService.calInterest(1200, 9, 10);
		System.out.println(result);
		
		((AbstractApplicationContext) ctx).close();
	}
}