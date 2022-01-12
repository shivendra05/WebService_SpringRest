package com.example.details;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp")
public class EmployeeDetails implements CommandLineRunner{

	private int userId;
	private String	userName;
	private int userAge;
	private String userAddr;
	//private String[] semMarks;
	//private List<Integer> semMarks;
	private Set semMarks;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	/*
	 * public String[] getSemMarks() { return semMarks; }
	 * 
	 * public void setSemMarks(String[] semMarks) { this.semMarks = semMarks; }
	 */

	/*
	 * public List getSemMarks() {
	 * return semMarks;
	 * }
	 * 
	 * public void setSemMarks(List semMarks) {
	 * this.semMarks = semMarks;
	 * }
	 */


	@Override
	public String toString() {
		return "EmployeeDetails [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userAddr="
				+ userAddr + ", semMarks=" + semMarks + "]";
	}

	public Set getSemMarks() {
		return semMarks;
	}

	public void setSemMarks(Set semMarks) {
		this.semMarks = semMarks;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
}
