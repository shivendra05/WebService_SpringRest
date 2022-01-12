package com.service;

public class UserShopping {
	
	public double shopping(String []items,double []prices) {
		System.out.println("UserShopping.shopping()");
		double sum=0;
		for(double price:prices) {
			sum= sum+price;
		}
		System.out.println(sum);
		return sum;
	}
}