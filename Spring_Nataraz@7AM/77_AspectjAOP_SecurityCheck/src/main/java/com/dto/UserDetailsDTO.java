package com.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDetailsDTO implements Serializable{
	private String userName;
	private String password;
}