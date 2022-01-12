package com.testArray;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.array.StudentMarks;
import com.list.StudentDetails;
import com.map.EmployeeLife;
import com.prop.Fruits;
import com.set.StudentContactDetails;

public class StudentTest {
	public static void main(String[] args) {
		StudentMarks marks=null;
		EmployeeLife empLife=null;
		Fruits fruit=null;
		StudentContactDetails conatactDetails=null;
		StudentDetails details=null;
		DefaultListableBeanFactory factory= null;
		XmlBeanDefinitionReader reader=null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
		System.out.println("-----------Array-------------");
		marks=factory.getBean("array",StudentMarks.class);
		System.out.println(marks);
		System.out.println("----------List--------------");
		details=factory.getBean("list",StudentDetails.class);
		System.out.println(details);
		System.out.println("------------Set-------------");
		conatactDetails= factory.getBean("set",StudentContactDetails.class);
		System.out.println(conatactDetails);
		System.out.println("------------Map-------------");
		empLife= factory.getBean("map",EmployeeLife.class);
		System.out.println(empLife);
		System.out.println("------------Prop-------------");
		fruit= factory.getBean("prop",Fruits.class);
		System.out.println(fruit);
	}
}