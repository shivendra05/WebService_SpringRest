package com.service;

public class BankService {

	public float calInterestsAmount(float amount, float time, float rate) {
		System.out.println("BankService.calInterestsAmount()");
		return amount*time*rate/100.0f;
	}
}
