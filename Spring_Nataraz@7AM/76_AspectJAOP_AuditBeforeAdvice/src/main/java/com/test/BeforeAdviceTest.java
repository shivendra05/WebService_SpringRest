package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CarService;

public class BeforeAdviceTest {
	public static void main( String[] args ){
		CarService service=null;
		ApplicationContext ctx = null;
		
		ctx = new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		service  = ctx.getBean("carservice",CarService.class);
		String msg= service.sale("Honda 8943JSDD", 12009403, "Manoj Mishra");
		System.out.println(msg);
		((AbstractApplicationContext) ctx).close();
	}
}
