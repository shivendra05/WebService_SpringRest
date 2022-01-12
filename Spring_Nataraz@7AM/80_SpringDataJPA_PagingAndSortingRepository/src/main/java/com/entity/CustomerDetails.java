package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
//@ToString
public class CustomerDetails implements Serializable{
	
	@Id
	@Type(type = "int")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cno;
	@Column(length = 20)
	@Type(type = "string")
	private String cname;
	@Column(length = 20)
	@Type(type = "string")
	private String cadd;
	@Type(type = "double")
	private double billAmount;
}