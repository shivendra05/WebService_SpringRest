package com.payment;

public class IndianPost implements PaymentMode{
	//dependent class

	public void setCourier(PaymentMode courier){
		System.out.println("IndianPost.setCourier()");
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
