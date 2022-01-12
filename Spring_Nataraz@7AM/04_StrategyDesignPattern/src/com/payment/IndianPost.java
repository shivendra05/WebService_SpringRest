package com.payment;

public class IndianPost implements PaymentMode{

	PaymentMode payment=null;

	public IndianPost() {
		System.out.println("IndinPost.IndinPost()");
	}

	@Override
	public String doPayment(String[] clothes, double [] prices) {
		double totalBill = 0;
		for(double price:prices) {
			totalBill+=price;
		}
		return "Your Bill for shopping" +clothes.toString()+ "is :"+totalBill;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
