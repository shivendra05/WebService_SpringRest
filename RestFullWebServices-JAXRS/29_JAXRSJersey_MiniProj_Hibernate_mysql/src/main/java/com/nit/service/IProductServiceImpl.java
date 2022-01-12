package com.nit.service;

import java.util.List;

import javax.inject.Inject;

import com.nit.dao.IProductDAO;
import com.nit.model.Product;

public class IProductServiceImpl implements IProductService {

	@Inject
	private IProductDAO dao;
	
	@Override
	public Integer saveProd(Product prod) {

		double discount =  prod.getPcost()*10/100;
		double gst =   prod.getPcost()+prod.getPcost()*17/100;
		
		prod.setDiscount(discount);
		prod.setGst(gst);
		
		Integer status = dao.saveProduct(prod);
		System.out.println("service "+status);
		return status;
	}

	@Override
	public void updateProd(Product prod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProd(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProdByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProd() {
		// TODO Auto-generated method stub
		return null;
	}

}
