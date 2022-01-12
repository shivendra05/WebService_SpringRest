package com.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.controller.Controller;
import com.vo.CustomerVO;

public class CustomerTest {

	public static void main(String[] args) {
		Controller control=null;
		CustomerVO vo=null;
		Scanner sn=null;
		String custName=null,cAddress=null,pamount=null,rate=null,time=null;

		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		control = factory.getBean("controller",Controller.class);
		sn = new Scanner(System.in);
		vo= new CustomerVO();
		
		try {

			System.out.println("Enter Customer Name::");
			custName=sn.next();
			vo.setCname(custName);
			System.out.println("Enter Customer Address::");
			cAddress=sn.next();
			vo.setCadd(cAddress);
			System.out.println("Enter Customer Principle Amount::");
			pamount=sn.next();
			vo.setPamount(pamount);
			System.out.println("Enter Customer rate of Interest::");
			rate=sn.next();
			vo.setRate(rate);
			System.out.println("Interest time::");
			time=sn.next();
			vo.setTime(time);
			
			String status = control.findInterest(vo);

			System.out.println(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}