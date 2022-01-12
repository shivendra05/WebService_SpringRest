package com.example.demo;

import java.util.Arrays;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("stud")
public class Student implements CommandLineRunner {

	private int sID;
	private String sName;
	private int sAge;
	private String[] subj;
	private Map<String, Integer> marks;
	
	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public String[] getSubj() {
		return subj;
	}

	public void setSubj(String[] subj) {
		this.subj = subj;
	}

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
		return String.format("Student [sID=%s, sName=%s, sAge=%s, subj=%s, marks=%s]", sID, sName, sAge,
				Arrays.toString(subj), marks);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello");
		System.out.println(this);
	}
}
