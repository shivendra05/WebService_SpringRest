package com.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.bean.test.WishMessageGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator msg=null;
		ctx= SpringApplication.run(Application.class, args);
		
		msg = ctx.getBean("wish",WishMessageGenerator.class);
		
		String youAreWished = msg.wishMessage("Shivendra");
		System.out.println(youAreWished);
		
		((ConfigurableApplicationContext) ctx).close();
	}
}