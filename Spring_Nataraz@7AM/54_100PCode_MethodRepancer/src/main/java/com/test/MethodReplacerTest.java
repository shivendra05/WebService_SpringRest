package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.CalculateInterest;
import com.cfgs.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		CalculateInterest interest=null;
		ApplicationContext ctx=null;

		ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		interest =ctx.getBean("calc", CalculateInterest.class);
		float intAmount = interest.calInterest(1000, 12, 8);	
		
		System.out.println(intAmount);
	}

}
