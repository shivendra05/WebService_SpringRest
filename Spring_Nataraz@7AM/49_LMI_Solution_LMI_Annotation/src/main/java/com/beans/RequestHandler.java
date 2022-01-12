package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("handler")
@Scope("prototype")
public class RequestHandler {
	public static int count;
	public RequestHandler(){
		count++;
		System.out.println("RequestHandler.RequestHandler1()::"+count);
	}

	public void handleRequest(String data) {
		System.out.println("Handle request with data : "+data);
	}
}