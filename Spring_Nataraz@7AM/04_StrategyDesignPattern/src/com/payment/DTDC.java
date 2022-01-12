package com.payment;

public class DTDC implements PaymentMode{

	PaymentMode payment=null;

	public DTDC() {
		System.out.println("DTDC.DTDC()");
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
