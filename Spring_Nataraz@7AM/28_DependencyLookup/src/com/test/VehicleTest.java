package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.bean.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1=null, v2=null;
		DefaultListableBeanFactory factory =null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		v1 = factory.getBean("vehicle",Vehicle.class);		
		v1.startJourney("Rewa","Pune");
		v1.playMusic();
		v1.playMusic();

		System.out.println("================================");

		v2 = factory.getBean("vehicle",Vehicle.class);		
		v2.startJourney("Pune","Hyderanad");
		v2.playMusic();
		v2.playMusic();
	}
}