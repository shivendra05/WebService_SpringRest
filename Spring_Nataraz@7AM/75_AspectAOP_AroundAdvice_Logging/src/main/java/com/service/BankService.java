package com.service;

public class BankService {

	public float calInterest(float amount, float rate, float time) {
		return amount*rate*time/100.0f;
	}
}
