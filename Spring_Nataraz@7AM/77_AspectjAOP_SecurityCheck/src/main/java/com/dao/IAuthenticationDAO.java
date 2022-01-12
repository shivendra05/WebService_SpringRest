package com.dao;

import com.bo.UserDetailsBO;

public interface IAuthenticationDAO {

	public int Authenticate(UserDetailsBO bo);
}
