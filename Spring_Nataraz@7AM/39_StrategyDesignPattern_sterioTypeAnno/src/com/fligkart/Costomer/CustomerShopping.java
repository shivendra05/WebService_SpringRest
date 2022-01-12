package com.fligkart.Costomer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flipkart.FlipKart;


public class CustomerShopping {

	public static void main(String[] args) {
		ApplicationContext ctx= null;
		ctx =  new ClassPathXmlApplicationContext("com\\cfgs\\applicationContext.xml");
		FlipKart kart=null;	

		/*kart = ctx.getBean("flip", FlipKart.class);*/
		kart = ctx.getBean(FlipKart.class);
		kart.doShopping();

		((AbstractApplicationContext) ctx).close();
	}
}