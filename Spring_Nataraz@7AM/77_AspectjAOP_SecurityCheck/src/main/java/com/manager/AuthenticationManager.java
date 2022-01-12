package com.manager;

import org.springframework.beans.BeanUtils;

import com.bo.UserDetailsBO;
import com.dao.IAuthenticationDAO;
import com.dto.UserDetailsDTO;

public class AuthenticationManager {

	private ThreadLocal<UserDetailsDTO> threadlocal = new ThreadLocal<>();
	IAuthenticationDAO dao;

	AuthenticationManager(IAuthenticationDAO dao){
		this.dao=dao;
	}

	public void signIn(String username,String password) {
		UserDetailsDTO dto = new UserDetailsDTO();
		dto.setPassword(password);
		dto.setUserName(username);
		threadlocal.set(dto);
	}

	public void signOut() {
		threadlocal.remove();
	}

	public boolean validate() {
		UserDetailsDTO dto= threadlocal.get();
		UserDetailsBO bo = new UserDetailsBO();

		BeanUtils.copyProperties(dto,bo);
		int count =dao.Authenticate(bo);
		
		return count==1?true:false;
	}
}
