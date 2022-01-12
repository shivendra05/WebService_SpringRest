package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.injection.Collage;

public class BeanInnheritenceTest {
	public static void main( String[] args ) {
		Collage clg=null,clg1=null;
		DefaultListableBeanFactory factory= null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		clg = factory.getBean("student1",Collage.class);
		System.out.println(clg.prepareResult());
		System.out.println("-----------------");
		clg1 = factory.getBean("student2",Collage.class);
		System.out.println(clg1.prepareResult());
	}
}