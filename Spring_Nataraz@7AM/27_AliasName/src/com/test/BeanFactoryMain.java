package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bean.WishMessage;

public class BeanFactoryMain {

	public static void main(String[] args) {

		BeanFactory factory= null;
		Resource  resource =null;
		WishMessage msg= null;
		WishMessage yourMSG=null;
		//locate resouce file
		resource = new FileSystemResource("src\\com\\cfgs\\ApplicationContext.xml");
		//create beanfactory IOC container object 
		factory= new XmlBeanFactory(resource);

		//get the Target bean
		Object obj = factory.getBean("msg1");
		yourMSG = (WishMessage)obj;
		String greetings = yourMSG.wishGenerate("Shivendra");
		System.out.println(greetings);

		System.out.println("-----------------");

		obj = factory.getBean("wish");
		yourMSG = (WishMessage)obj;
		String greetings1 = yourMSG.wishGenerate("Pandey");
		System.out.println(greetings1);

		System.out.println("-----------------");

		obj = factory.getBean("wish1");
		yourMSG = (WishMessage)obj;
		String greetings2 = yourMSG.wishGenerate("Shyamkali");
		System.out.println(greetings2);
		
		System.out.println("-----------------");

		obj = factory.getBean("wish2");
		yourMSG = (WishMessage)obj;
		String greetings3 = yourMSG.wishGenerate("Sudha");
		System.out.println(greetings3);
	}
}