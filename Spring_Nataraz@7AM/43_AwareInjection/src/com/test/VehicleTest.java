package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1=null, v2=null;
		ApplicationContext ctx= null;
		
		ctx = new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		v1 = ctx.getBean("vehicle",Vehicle.class);		
		v1.startJourney("Rewa","Pune");
		v1.playMusic();
		v1.playMusic();

		System.out.println("================================");

		v2 = ctx.getBean("vehicle",Vehicle.class);		
		v2.startJourney("Pune","Hyderanad");
		v2.playMusic();
		v2.playMusic();
		
		((AbstractApplicationContext) ctx).close();
	}
}