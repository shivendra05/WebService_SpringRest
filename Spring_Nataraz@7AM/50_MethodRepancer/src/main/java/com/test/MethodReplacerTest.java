package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.CalculateInterest;

public class MethodReplacerTest {

	public static void main(String[] args) {
		CalculateInterest interest=null;
		ApplicationContext ctx=null;

		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		interest =ctx.getBean("calculate_replacer", CalculateInterest.class);
		float intAmount = interest.calInterest(1000, 12, 8);	
		
		System.out.println(intAmount);
	}

}
