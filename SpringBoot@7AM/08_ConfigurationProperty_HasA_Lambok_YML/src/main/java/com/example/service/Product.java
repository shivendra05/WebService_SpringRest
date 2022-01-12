package com.example.service;

import java.util.Map;

import lombok.Data;

//@Getter
//@Setter
//@ToString
@Data
public class Product {
	private int pId;
	private double pPrice;
	private String pName;
	private boolean pStatus;
	private Map ingredient;
}