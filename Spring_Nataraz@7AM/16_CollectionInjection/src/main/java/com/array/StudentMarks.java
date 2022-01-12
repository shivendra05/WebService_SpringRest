package com.array;

import java.util.Arrays;
import java.util.Date;

public class StudentMarks {
	int[] marks;
	Date[] date;

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setDate(Date[] date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StudentMarks [marks=" + Arrays.toString(marks) + ", date=" + Arrays.toString(date) + "]";
	}
}