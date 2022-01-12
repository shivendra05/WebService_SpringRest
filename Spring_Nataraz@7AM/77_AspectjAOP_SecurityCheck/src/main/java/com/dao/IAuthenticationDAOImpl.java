package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bo.UserDetailsBO;

public class IAuthenticationDAOImpl implements IAuthenticationDAO{
	private final static String AUTH_QUERY ="SELECT count(*) from USERLIST WHERE username=? and password=?";

	private JdbcTemplate jt;

	IAuthenticationDAOImpl(JdbcTemplate jt){
		this.jt=jt;
	}
	@Override
	public int Authenticate(UserDetailsBO bo) {
		int count = jt.queryForObject(AUTH_QUERY, Integer.class,bo.getUserName(),bo.getPassword());
		
		return count;
	}
}