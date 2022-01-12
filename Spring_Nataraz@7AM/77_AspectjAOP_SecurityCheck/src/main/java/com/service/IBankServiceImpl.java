package com.service;

import com.dao.IBankDAO;

public class IBankServiceImpl implements IBankService {

	IBankDAO dao;
	IBankServiceImpl(IBankDAO dao){
		this.dao=dao;
	}
	
	@Override
	public String withdrawMoney(int account, float balance) {
		int count  = dao.withdraw(account, balance);
		return count==0?"Failed to Withdraw Amount ":balance +" has been withdrawn from account::"+account;
	}

	@Override
	public String depositMoney(int account, float balance) {
		int count  = dao.deposit(account, balance);
		return count==0?"Failed to Deposit Amount ":balance +" has been deposited to account::"+account;
	}
}