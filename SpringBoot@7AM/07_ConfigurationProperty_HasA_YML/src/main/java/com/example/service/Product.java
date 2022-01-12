package com.example.service;

import java.util.Arrays;
import java.util.Map;

public class Product {
	private int pId;
	private double pPrice;
	private String pName;
	private boolean pStatus;
	private Map ingredient;
	
	public Map getIngredient() {
		return ingredient;
	}

	public void setIngredient(Map ingredient) {
		this.ingredient = ingredient;
	}

	private String[] addr;
	
	public String[] getAddr() {
		return addr;
	}

	public void setAddr(String[] addr) {
		this.addr = addr;
	}

	public int getpId() {
		return pId;
	}
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public double getpPrice() {
		return pPrice;
	}
	
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public boolean ispStatus() {
		return pStatus;
	}
	
	public void setpStatus(boolean pStatus) {
		this.pStatus = pStatus;
	}
	
	@Override
	public String toString() {
		return String.format("Product [pId=%s, pPrice=%s, pName=%s, pStatus=%s, ingredient=%s, addr=%s]", pId, pPrice,
				pName, pStatus, ingredient, Arrays.toString(addr));
	}
}