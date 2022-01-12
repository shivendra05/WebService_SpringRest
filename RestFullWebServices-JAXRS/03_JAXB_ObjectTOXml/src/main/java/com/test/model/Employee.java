package com.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
//class + JAXB Annotations=> JABX Class
@XmlRootElement(name = "emp-data") // <employee> .. </employee>

//Enable JAXB Annotations which are defined on FIELDs(variables)
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	@XmlAttribute(name="employee-id")
	private int empId;
	
	@XmlElement(name="employee-name")
	private String empName;
	@XmlElement(name="employee-salary")
	private double empSal;
	
	@XmlElement(name="employee-project")
	private String empProject;
	
	@XmlElement(name="employee-experience")
	private double empExp;
	
	//Ignore any variable 
	@XmlTransient
	private String empDept;
	
}
