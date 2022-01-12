package com.dao;

public interface IBankDAO {

	public int withdraw(int account,float balance);
	public int deposit(int account,float balance);
}
