package com.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.StudentBO;
import com.service.StudentService;

public class StudentTest {

	public static void main(String[] args) throws Exception {
		List<StudentBO> listBo=null;
		List<StudentBO> listBo1=null;
		String bo=null;
		Scanner sn= null;
		ApplicationContext ctx= null;
		StudentService service=null;
		
		//create IOC container
		ctx= new ClassPathXmlApplicationContext("com/cfgs/applicationContext.xml");
		sn = new Scanner(System.in);
		//create bean
		service = ctx.getBean("service",StudentService.class);
		//invoke methods
		
		System.out.println("--------------------------Get Student Details-------------");
		System.out.println("Enter Employee no.::");
		bo = service.getAllStudentService(sn.nextInt());
		System.out.println("Values are:: "+bo);
		
		((AbstractApplicationContext) ctx).close();
	}
}