package com.map;

import java.util.Date;
import java.util.Map;

public class EmployeeLife {

	Map<String,Integer> vegitables;
	Map<Integer, Date> facultyDetails;

	public void setVegitables(Map<String, Integer> vegitables) {
		this.vegitables = vegitables;
	}

	public void setFacultyDetails(Map<Integer, Date> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	@Override
	public String toString() {
		return "Vegetabls [vegitables=" + vegitables + ", facultyDetails=" + facultyDetails + "]";
	}
}