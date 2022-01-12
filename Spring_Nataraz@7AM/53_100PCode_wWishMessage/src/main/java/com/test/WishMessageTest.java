package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.beans.WishMessageGenerator;
import com.cfgs.ApplicationContextConfiguration;

public class WishMessageTest {
	public static void main(String[] args) {
		WishMessageGenerator wish=null;
		ApplicationContext ctx= null;

		ctx=new AnnotationConfigApplicationContext(ApplicationContextConfiguration.class);
		wish = ctx.getBean("wishmsg",WishMessageGenerator.class);
		String msg =wish.wishMessage("shiv");
		System.out.println(msg);
		
		((AbstractApplicationContext) ctx).close();
	}
}