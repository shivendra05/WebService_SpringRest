package com.nit.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Student {

	String sname;
	int sid;
	int sage;
	
	
}
