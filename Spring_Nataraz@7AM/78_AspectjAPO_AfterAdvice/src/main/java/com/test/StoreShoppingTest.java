package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserShopping;

public class StoreShoppingTest {
	public static void main(String[] args) {
		UserShopping user=null;
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		user = ctx.getBean("shop",UserShopping.class);
		System.out.println(user.shopping(new String[] {"jeans","shirt","blanket"},new double[] {100,100,100}));;
		
		((AbstractApplicationContext) ctx).close();
	}
}