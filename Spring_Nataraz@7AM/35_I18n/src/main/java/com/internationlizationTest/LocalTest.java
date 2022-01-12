package com.internationlizationTest;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LocalTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale loc=null;
		String cap1=null,cap2=null,cap3=null,cap4=null;
		ctx = new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		loc= new Locale(args[0], args[1]);
		cap1 = ctx.getMessage("btn1.cap",null,loc);
		cap2 = ctx.getMessage("btn2.cap",null,loc);
		cap3 = ctx.getMessage("btn3.cap",null,loc);
		cap4 = ctx.getMessage("btn4.cap",null,loc);
		System.out.println(cap1+" "+cap2+" "+cap3+" "+cap4);
		((AbstractApplicationContext) ctx).close();
	}
}	