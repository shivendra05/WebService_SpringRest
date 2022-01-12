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
		StudentBO bo=null;
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
		System.out.println("Values are:: "+bo.getSname()+" "+bo.getDoorno()+" "+bo.getState()+" "+bo.getPincode());
		
		System.out.println("--------------------------Get Student Details By City Name- ResultSetExtractor------------");
		System.out.println("Enter Employees 3 City Names.::");
		listBo = service.getAllStudentDetails(sn.nextLine(),sn.nextLine(),sn.nextLine());
		listBo.forEach(list->System.out.println(list));
		
		System.out.println("--------------------------Get Student Details By City Name -RowCallbackHandler------------");
		System.out.println("Enter Employees 3 City Names.::");
		listBo1 = service.getStudByCityRowCallBack(sn.nextLine(),sn.nextLine(),sn.nextLine());
		listBo1.forEach(list1->System.out.println(list1));
		
		((AbstractApplicationContext) ctx).close();
	}
}