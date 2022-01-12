package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.ScheduleRaminder;

public class MeetingSchedulerTest {

	public static void main(String[] args) {
		ScheduleRaminder remainder=null;
		String msg=null;
		ApplicationContext ctx= null;
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");

		remainder = ctx.getBean("scheduleRemainder", ScheduleRaminder.class);
		msg = remainder.sendRemainder();
		System.out.println(msg);


		((AbstractApplicationContext) ctx).close();
	}
}