package com.payment;

public class IndianPost implements PaymentMode{
	//dependent class
	@Override
	public String doPayment(String[] clothes, double [] prices) {
		System.out.println("IndianPost.IndianPost()");
		double totalBill = 0;
		for(double price:prices) {
			totalBill+=price;
		}
		return "Your Bill for shopping" +clothes.toString()+ "is :"+totalBill;
	}
}
