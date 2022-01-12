package com.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.bean.WishMessage;

public class FeanFactoryMain {

	public static void main(String[] args) {

		WishMessage msg= null,msg1= null,msg2= null,msg3= null,msg4= null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		//create IOC container
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com\\cfgs\\ApplicationContext.xml");
		msg = factory.getBean("msg",WishMessage.class);
		//String greetings = msg.wishGenerate("PandeyJI");
		System.out.println(msg.hashCode());
		System.out.println("--------------------------");
		msg1 = factory.getBean("msg",WishMessage.class);
		//String greetings1 = msg1.wishGenerate("PandeyJI");
		System.out.println(msg1.hashCode());;
		System.out.println("--------------------------");
		msg2 = factory.getBean("msg",WishMessage.class);
		//String greetings2 = msg2.wishGenerate("PandeyJI");
		System.out.println(msg2.hashCode());

		System.out.println("msg==msg1 ?"+(msg==msg1));
		System.out.println("msg1==msg2 ?"+(msg1==msg2));
		System.out.println("msg==msg2 ?"+(msg==msg2));
		
		System.out.println("----------------------ProtoType---------------------");
		
		msg3 = factory.getBean("msg1",WishMessage.class);
		//String greetings1 = msg1.wishGenerate("PandeyJI");
		System.out.println(msg3.hashCode());;
		System.out.println("--------------------------");
		msg4 = factory.getBean("msg2",WishMessage.class);
		//String greetings2 = msg2.wishGenerate("PandeyJI");
		System.out.println(msg4.hashCode());

		System.out.println("msg3==msg4 ?"+(msg3==msg4));
	}
}