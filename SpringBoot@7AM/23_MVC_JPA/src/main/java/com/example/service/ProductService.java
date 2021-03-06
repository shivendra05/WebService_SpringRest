package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService {

	public String inserData(Product prod);
	public long getRowCount();
	public List<Product> showAllData();
	public String deleteProductByID(int prodID);
}
