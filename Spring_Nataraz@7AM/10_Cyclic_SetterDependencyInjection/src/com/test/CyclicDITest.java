package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.component.A;
import com.component.B;

public class CyclicDITest {

	public static void main(String[] args) {
		A a=null;
		BeanFactory factory = null;
		Resource resource= null;
		B b= null;

		//locator and hold file path
		resource = new FileSystemResource("src/com/cfgs/applicationContext.xml");
		//IOC container
		factory = new XmlBeanFactory(resource);
		//get the target class bean
		a = factory.getBean("cyclicA",A.class);
		System.out.println(a);
	}
}