package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.component.A;
import com.component.B;

public class CyclicDITest {

	public static void main(String[] args) {
		A a=null;
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader=null;
		B b= null;

		//locator and hold file path
		factory= new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		//ioc container
		//a = factory.getBean("cyclicA",A.class); //cyclic dependency
		b = factory.getBean("cyclicB",B.class);
		System.out.println(b);
	}
}