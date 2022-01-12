package com.fligkart.Costomer;

import com.fligkart.FlipKart;

public class CustomerShopping {

	
	public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, Exception {
		FlipKart shop = null;
		
		shop = new FlipKart();
		shop.doShopping();
	}

}
