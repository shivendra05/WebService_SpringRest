package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	RequestHandler rHandle;
	
	String beanid=null;
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	WebContainer(){
		System.out.println("WebContainer.WebContainer()");
	}
	
	public void processingHandlerRequest(String data) {
		RequestHandler rh=null;
		ApplicationContext ctx= null;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		
		rh =ctx.getBean(beanid,RequestHandler.class);
		rh.handleRequest(data);
		
		((AbstractApplicationContext) ctx).close();
	}
}