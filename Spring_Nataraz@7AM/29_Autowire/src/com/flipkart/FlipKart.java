package com.flipkart;

import com.payment.BlueDart;
import com.payment.IndianPost;
import com.payment.PaymentMode;

public class FlipKart {
	//target class
	PaymentMode payment;


	FlipKart(PaymentMode payment) {
		this.payment = payment;
		System.out.println("FlipKart.FlipKart():: 0-Constructor");
	}
	
	
	public void setPayment(PaymentMode payment) {
		this.payment=payment;
		System.out.println("FlipKart.setPayment()");
	}

	public void doShopping(String[] strings, double[] ds) {
		String yourOurder = payment.doPayment(strings,ds);
		System.out.println(yourOurder);
	}

}
