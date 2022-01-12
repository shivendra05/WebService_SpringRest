package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.component.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student=null;
		BeanFactory factory = null;
		Resource resource= null;

		//locator and hold file path
		resource = new FileSystemResource("src/com/cfgs/applicationContext.xml");
		//IOC container
		factory = new XmlBeanFactory(resource);
		//get the target class bean
		student = factory.getBean("stud",Student.class);
		System.out.println(student.toString());
	}

}
