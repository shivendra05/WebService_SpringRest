package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vehicle implements ApplicationContextAware{
	String beanid=null;
	ApplicationContext ctx=null;

	Vehicle(ApplicationContext ctx){
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

	@Override
	public void setApplicationContext( ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}

	public void startJourney(String startPoint,String endPoint) {
		Engine engine=null;
		engine = ctx.getBean(beanid,Engine.class);
		engine.startEngine();
		System.out.println("Journey started:: "+startPoint);

		engine.startEngine();
		System.out.println("*****Journey started from *******");

		engine.stopEngine();
		System.out.println("Journey started:: "+endPoint);
	}
}