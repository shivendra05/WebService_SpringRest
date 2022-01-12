package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1=null;
		ApplicationContext ctx= null;
		
		ctx = new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		v1 = ctx.getBean("vehicle",Vehicle.class);		
		v1.startJourney("Rewa","Pune");
		v1.playMusic();
		v1.playMusic();

		((AbstractApplicationContext) ctx).close();
	}
}