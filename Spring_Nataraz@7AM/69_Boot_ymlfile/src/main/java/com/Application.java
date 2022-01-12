package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.beans.PersonDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx= null;
		PersonDetails person=null;
		ctx=  SpringApplication.run(Application.class, args);
		
		person = ctx.getBean("per",PersonDetails.class);
		System.out.println(person);
		
		((ConfigurableApplicationContext) ctx).close();
	}
}
