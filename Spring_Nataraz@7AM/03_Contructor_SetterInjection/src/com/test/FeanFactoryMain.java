package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bean.WishMessage;

public class FeanFactoryMain {

	public static void main(String[] args) {

		BeanFactory factory= null;
		Resource  resource =null;
		WishMessage yourMSG= null;

		//locate resouce file
		//resource = new FileSystemResource("src\\com\\cfgs\\ApplicationContext.xml");
		resource = new ClassPathResource("ApplicationContext.xml");
		//create beanfactory IOC container object 
		factory= new XmlBeanFactory(resource);
		
		//get the Target bean
		//Object obj = factory.getBean("msg_constructor");
		yourMSG = factory.getBean("msg_constructor",WishMessage.class);
		//WishMessage yourMSG = (WishMessage)obj;
		String greetings = yourMSG.wishGenerate("PandeyJI");
		System.out.println(greetings);

	}
}