package com.payment;

public class DTDC implements PaymentMode{
	//dependent class
	@Override
	public String doPayment(String[] clothes, double [] prices) {
		System.out.println("DTDC.DTDC()");
		double totalBill = 0;
		for(double price:prices) {
			totalBill+=price;
		}
		return "Your Bill for shopping" +clothes+ "is :"+totalBill;
	}

}
