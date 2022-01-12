package com.injection;

import java.util.Set;

public class StudentCourses{

	public Set<String> courses=null;
	
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "StudentCourses [courses=" + courses + "]";
	}
}