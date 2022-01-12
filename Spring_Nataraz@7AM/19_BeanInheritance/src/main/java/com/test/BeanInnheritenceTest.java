package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.injection.EmployeePropertyInheritance;

public class BeanInnheritenceTest {
	public static void main( String[] args ) {
		EmployeePropertyInheritance emp=null,emp1=null;
		DefaultListableBeanFactory factory= null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		emp = factory.getBean("shivendra",EmployeePropertyInheritance.class);
		System.out.println(emp);
		System.out.println("-----------------");
		emp1 = factory.getBean("shiv",EmployeePropertyInheritance.class);
		System.out.println(emp1);
	}
}
