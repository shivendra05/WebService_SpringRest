package com.payment;

public class BlueDart implements PaymentMode{
	//dependent class

	public BlueDart(){
		System.out.println("BlueDart.BlueDart():: 0-param constructor");
	}
	public void setCourier(PaymentMode courier){
		System.out.println("BlueDart.setCourier()");
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
