package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.WebContainer;

public class LMITest {

	public static void main(String[] args) {
		WebContainer container=null;
		//create IOC container
		ApplicationContext ctx= null;
		ctx = new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		//get bean 
		container =ctx.getBean("container",WebContainer.class);
		//invoke methods
		container.processingRequest("Hey");
		System.out.println("-----------------------------");
		container.processingRequest("Hi");
		System.out.println("-----------------------------");
		container.processingRequest("Bye bye");
		
		((AbstractApplicationContext) ctx).close();
	}
}