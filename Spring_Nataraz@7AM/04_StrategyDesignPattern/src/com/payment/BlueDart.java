package com.payment;

public class BlueDart implements PaymentMode{

	PaymentMode payment=null;

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String doPayment(String[] clothes, double [] prices) {
		double totalBill = 0;
		for(double price:prices) {
			totalBill+=price;
		}
		return "Your Bill for shopping" +clothes+ "is :"+totalBill;
	}

}
