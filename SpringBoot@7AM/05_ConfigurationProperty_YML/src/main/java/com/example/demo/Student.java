package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("stud")
public class Student implements CommandLineRunner {

	private int sID;
	private String sName;
	private int sAge;
	
	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	
	@Override
	public String toString() {
		return String.format("Student [sID=%s, sName=%s, sAge=%s]", sID, sName, sAge);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello");
		System.out.println(this);
	}
}
