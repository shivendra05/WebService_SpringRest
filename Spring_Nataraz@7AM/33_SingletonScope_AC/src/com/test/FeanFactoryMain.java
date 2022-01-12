package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.WishMessage;

public class FeanFactoryMain {

	public static void main(String[] args) {

		WishMessage msg= null;

		ApplicationContext ac = null;
		ac = new FileSystemXmlApplicationContext("src\\com\\cfgs\\ApplicationContext.xml");
		msg = ac.getBean("msg",WishMessage.class);
		String greetings = msg.wishGenerate("PandeyJI");
		System.out.println(greetings);

		((AbstractApplicationContext) ac).close();
	}
}