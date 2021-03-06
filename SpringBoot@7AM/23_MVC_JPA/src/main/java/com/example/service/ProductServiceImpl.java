package com.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repo;

	@Override
	public String inserData(Product prod) {
		System.out.println("ProductServiceImpl.inserData():: Service Save Data");
		System.out.println(prod);
		
		Integer qty = prod.getQty();
		Double price = prod.getPrice();
		
		//Product cost calculation
		Double tltPrice = qty*price;
		Double gst = tltPrice*12/100;
		Double bill = gst+tltPrice;
		
		prod.setGst(gst);
		prod.setBill(bill);

		repo.save(prod);
		System.out.println("******** Saved ***********");
		return "Product Detial is saved";
	}

	@Override
	public long getRowCount() {
		long rowCount = repo.count();
		return rowCount;
	}

	@Override
	public List<Product> showAllData() {
		List<Product> listProd = new ArrayList<Product>();
		
		listProd = repo.findAll();
		
		for (Product product : listProd) {
			System.out.println(product);
		}
		return listProd;
	}

	@Override
	public String deleteProductByID(int prodID) {

		repo.deleteById(prodID);
		return "Product deleted "+prodID;
	}

}
