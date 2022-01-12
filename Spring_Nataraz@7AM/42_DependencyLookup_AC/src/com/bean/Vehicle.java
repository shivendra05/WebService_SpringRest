package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

	String beanid=null;
	
	Vehicle(){
		System.out.println("Vehicle.Vehicle()::0-param constructor");
	}
	
	Vehicle(String bean){
		beanid=bean;
	}

	public void playMusic() {
		System.out.println("Vehicle::--->  start music");
	}

	public void startAC() {
		System.out.println("Vehicle::--->  start AC");
	}

	public void startAutomaticControl() {
		System.out.println("Vehicle::--->  start Automatic control");
	}

	//version1
	/*public void startJourney(String startPoint,String endPoint) {
	
		Engine engine=null;
		ApplicationContext ctx= null;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		engine = ctx.getBean(beanid,Engine.class);
		engine.startEngine();
		System.out.println("Journey started:: "+startPoint);
	
		engine.startEngine();
		System.out.println("*****Journey started from *******");
	
		engine.stopEngine();
		System.out.println("Journey started:: "+endPoint);
	}*/
	public void startJourney(String startPoint,String endPoint,ApplicationContext ctx) {

		Engine engine=null;
		/*ApplicationContext ctx= null;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		*/
		engine = ctx.getBean(beanid,Engine.class);
		engine.startEngine();
		System.out.println("Journey started:: "+startPoint);

		engine.startEngine();
		System.out.println("*****Journey started from *******");

		engine.stopEngine();
		System.out.println("Journey started:: "+endPoint);
	}
}