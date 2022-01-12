package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manager.AuthenticationManager;
import com.service.IBankService;



public class SecurityAspectTest 
{
	public static void main( String[] args )
	{
		IBankService bankService=null;
		AuthenticationManager manager =null;
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		bankService = ctx.getBean("userService",IBankService.class);
		manager  = ctx.getBean("authManager",AuthenticationManager.class);

		try {
			manager.signIn("sudha", "sudha123");
			System.out.println("Withdrwal Operation:: "+bankService.withdrawMoney(101, 1));;
			System.out.println("Deposit Operation:: "+bankService.depositMoney(101, 1));;
			manager.signOut();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) ctx).close();
	}
}
