package com.test;


import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FacotryBeanTest {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class c1=null;
		String str=null;
		Calendar cal1=null;
		factory= new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");

		c1 = factory.getBean("dt",Class.class);
		System.out.println(c1.toString());

		System.out.println("----------------------");

		cal1 = factory.getBean("cal",Calendar.class);
		System.out.println(cal1.toString());

		System.out.println("----------------------");

		str = factory.getBean("str",String.class);
		System.out.println(str.toString());
	}
}