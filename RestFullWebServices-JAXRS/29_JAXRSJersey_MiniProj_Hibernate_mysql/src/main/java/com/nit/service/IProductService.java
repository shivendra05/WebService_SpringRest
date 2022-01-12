package com.nit.service;

import java.util.List;

import com.nit.model.Product;

public interface IProductService {

	public Integer saveProd(Product prod);
	public void updateProd(Product prod);
	public void deleteProd(Integer id);

	public Product getProdByID(Integer id);
	public List<Product> getAllProd();
}
