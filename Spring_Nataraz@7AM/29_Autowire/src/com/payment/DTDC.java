package com.payment;

public class DTDC implements PaymentMode{
	//dependent class
	public DTDC(){
		System.out.println("DTDC.DTDC():: 0-param constructor");
	}
	public void setCourier(PaymentMode courier){
		System.out.println("DTDC.setCourier()");
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
