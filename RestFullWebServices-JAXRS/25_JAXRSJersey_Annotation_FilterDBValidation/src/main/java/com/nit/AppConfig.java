package com.nit;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.nit.filter.RequestFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig(){
		packages("com.nit");
		register(RequestFilter.class);
	}
}
