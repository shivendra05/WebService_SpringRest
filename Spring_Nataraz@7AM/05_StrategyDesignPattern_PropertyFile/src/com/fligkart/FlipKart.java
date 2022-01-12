package com.fligkart;

import com.payment.BlueDart;
import com.payment.IndianPost;
import com.payment.PaymentMode;

public class FlipKart {

	PaymentMode payment=null;

	public void setPaymentMode(PaymentMode payment){
		this.payment=payment;
	}

	public void doShopping(String mode) {
		if(mode.equalsIgnoreCase("blueDart")) {
			payment =new BlueDart();
		}else if(mode.equalsIgnoreCase("indianpost")) {
			payment =new IndianPost();
		}
		else if(mode.equalsIgnoreCase("dtdc")) {
			payment =new BlueDart();
		}else {
			throw new IllegalArgumentException("Wrong chioce");
		}
		setPaymentMode(payment);
		
		String yourOurder = payment.doPayment(new String[] {"Jeans","sihrt"}, new double []{21.32,4354.32});
		System.out.println(yourOurder);
	}
}
