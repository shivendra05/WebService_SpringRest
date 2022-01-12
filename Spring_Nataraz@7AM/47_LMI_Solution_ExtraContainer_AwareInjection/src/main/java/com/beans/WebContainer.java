package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class WebContainer implements ApplicationContextAware{
	ApplicationContext ctx=null;
	String beanid=null;
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx =ctx;
		System.out.println("WebContainer.setApplicationContext()");
	}
	
	WebContainer(){
		System.out.println("WebContainer.WebContainer()");
	}
	
	public void processingHandlerRequest(String data) {
		RequestHandler rh=null;
		System.out.println("ctx........."+ctx);
		rh =ctx.getBean(beanid,RequestHandler.class);
		System.out.println("rh........."+rh);
		rh.handleRequest(data);
		((AbstractApplicationContext) ctx).close();
	}
}