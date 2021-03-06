package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	public Integer id;
	private String name;
	private Integer qty;
	private Double price;

	private Double bill;
	private Double gst;
}
