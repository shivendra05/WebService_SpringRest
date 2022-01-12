package com.service;

public interface IBankService {

	public String withdrawMoney(int account,float balance);
	public String depositMoney(int account,float balance);
}
