package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.WishMessage;

public class FeanFactoryMain {

	public static void main(String[] args) {

		WishMessage msg= null;
		ApplicationContext ac = null;
		ac = new FileSystemXmlApplicationContext("com\\cfgs\\ApplicationContext.xml");
		//create IOC container
		msg = ac.getBean("msg",WishMessage.class);
		//String greetings = msg.wishGenerate("PandeyJI");
		System.out.println(msg.hashCode());
	}
}