package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class IBankDAOImpl implements IBankDAO {

	private final static String WITHDRAW_AMOUNT ="UDPATE BankAccount SET balance=balance-? WHERE accnumber=?";
	private final static String DEPOSIT_AMOUNT ="UDPATE BankAccount SET balance=balance+? WHERE accnumber=?";

	private JdbcTemplate jt;

	IBankDAOImpl(JdbcTemplate jt){
		this.jt=jt;
	}

	@Override
	public int withdraw(int account, float balance) {
		int status = jt.update(WITHDRAW_AMOUNT);
		return status;
	}

	@Override
	public int deposit(int account, float balance) {
		int status = jt.update(DEPOSIT_AMOUNT);
		return status;
	}
}