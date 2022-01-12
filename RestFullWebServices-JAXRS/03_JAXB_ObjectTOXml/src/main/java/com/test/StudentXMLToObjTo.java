package com.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.test.model.Employee;

public class StudentXMLToObjTo{
	public static void main( String[] args ) throws Exception{

		Employee student = new Employee();

		student.setEmpId(100);
		student.setEmpName("shivendra");
		student.setEmpExp(30);
		student.setEmpDept("NITTTR");
		student.setEmpProject("Live Sports");
		student.setEmpSal(9876545.9887);

		JAXBContext context = JAXBContext.newInstance(Employee.class);

		Marshaller marshal = context.createMarshaller();

		marshal.marshal(student, new File("F:\\RestFullWebServices-JAXRS/employee1.xml"));

		System.out.println("Completed");

		Unmarshaller unmarshal = context.createUnmarshaller();

		Object obj =unmarshal.unmarshal(new File("F:\\RestFullWebServices-JAXRS/employee1.xml"));

		if(obj instanceof Employee) { //it avoids ClassCastException
			Employee emp=(Employee)obj;
			System.out.println(emp);
			System.out.println(emp.getEmpProject());
			System.out.println(emp.getEmpExp());
		}
		
		
		System.out.println("Completed");


	}
}