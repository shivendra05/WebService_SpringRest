package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.injection.StudentCourses;

public class BeanInnheritenceTest {
	public static void main( String[] args ) {
		StudentCourses stud=null,stud1=null;
		DefaultListableBeanFactory factory= null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		/*stud = factory.getBean("cseEngineering",StudentCourses.class);
		System.out.println(stud);*/
		System.out.println("-----------------");
		stud1 = factory.getBean("eceEngineering",StudentCourses.class);
		System.out.println(stud1);
	}
}
