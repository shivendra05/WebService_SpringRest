package com.beans;

public class WebContainer {
	
	RequestHandler rHandle;

	public void setrHandle(RequestHandler rHandle) {
		this.rHandle = rHandle;
	}
	WebContainer(){
		System.out.println("WebContainer.WebContainer()");
	}
	/*WebContainer(RequestHandler rHandle){
		System.out.println("WebContainer.WebContainer()");
		this.rHandle=rHandle;
	}*/
	
	public void processingRequest(String data) {
		System.out.println("Web caontianer processing request with ::"+data+" passing it to handler");
		rHandle.handleRequest(data);
	}
}
