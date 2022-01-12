package com.example.details;

import java.util.List;
import java.util.Map;

public class Department {

	private int dNumber;
	private String dName;
	private int dFloor;
	private Map familyMem;
	private List<String> subjs;
	private Map<String,Integer> rent;
	
	public List<String> getSubjs() {
		return subjs;
	}

	public void setSubjs(List<String> subjs) {
		this.subjs = subjs;
	}

	public Map getFamilyMem() {
		return familyMem;
	}

	public void setFamilyMem(Map familyMem) {
		this.familyMem = familyMem;
	}

	public int getdNumber() {
		return dNumber;
	}
	
	public void setdNumber(int dNumber) {
		this.dNumber = dNumber;
	}
	
	public String getdName() {
		return dName;
	}
	
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	public Map<String, Integer> getRent() {
		return rent;
	}

	public void setRent(Map<String, Integer> rent) {
		this.rent = rent;
	}

	public int getdFloor() {
		return dFloor;
	}
	
	public void setdFloor(int dFloor) {
		this.dFloor = dFloor;
	}

	@Override
	public String toString() {
		return String.format("Department [dNumber=%s, dName=%s, dFloor=%s, familyMem=%s, subjs=%s, rent=%s]", dNumber,
				dName, dFloor, familyMem, subjs, rent);
	}
}