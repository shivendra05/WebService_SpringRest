package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BankService;

/**
 * Hello world!
 *
 */
public class ApplicationTest
{
    public static void main( String[] args )
    {
    	float interest = 0.0f;
    	BankService serviceBank=null;
        ApplicationContext ctx= null;
        ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
        serviceBank = ctx.getBean("service",BankService.class);
        interest = serviceBank.calInterestsAmount(1200, 1, 12);
        System.out.println(interest);
        
        ((AbstractApplicationContext) ctx).close();
    }
}
