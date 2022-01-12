package com.fligkart.Costomer;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.flipkart.FlipKart;

public class CustomerShopping {

	public static void main(String[] args) {

		Resource resource= null;
		BeanFactory factory=null;
		FlipKart kart=null;	
		resource = new FileSystemResource("src\\com\\cfgs\\applicationContext.xml");
		factory = new XmlBeanFactory(resource);

		kart = factory.getBean("flpk", FlipKart.class);
		kart.doShopping(new String[] {"Jeans","sihrt"}, new double []{21.32,4354.32});
	}
}