package com.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {

	String beanid=null;

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

	public void startJourney(String startPoint,String endPoint) {

		Engine engine=null;
		DefaultListableBeanFactory factory =null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		//engine = factory.getBean("engine",Engine.class);
		engine = factory.getBean(beanid,Engine.class);
		engine.startEngine();
		System.out.println("Journey started:: "+startPoint);

		engine.startEngine();
		System.out.println("*****Journey started from *******");

		engine.stopEngine();
		System.out.println("Journey started:: "+endPoint);
	}
}