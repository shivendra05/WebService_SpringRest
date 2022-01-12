package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EmployeeDetails")
public class Employee implements Serializable {

	@Id
	@Column(name = "eid")
	int id;
	@Column(name = "ename")
	String name;
	@Column(name = "age")
	int age;
	
}
