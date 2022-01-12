package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public abstract class WebContainer implements ApplicationContextAware{
	ApplicationContext ctx=null;
	
	//@Lookup
	@Lookup("handler")
	public abstract RequestHandler createhandlerObject();
	
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
		rh =createhandlerObject();
		rh.handleRequest(data);
		((AbstractApplicationContext) ctx).close();
	}
}