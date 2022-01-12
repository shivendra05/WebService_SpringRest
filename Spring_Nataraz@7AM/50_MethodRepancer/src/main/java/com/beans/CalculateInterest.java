package com.beans;

public class CalculateInterest {

	CalculateInterest(){
		System.out.println("CalculateInterest.CalculateInterest():: 0 Param");
	}
	public float calInterest(float pAmount, float rate, float time) {

		return (pAmount*rate*time/100);
	}
}
