package com.set;

import java.util.Set;

public class StudentContactDetails {
	Set number;
	Set dates;

	public void setNumber(Set number) {
		this.number = number;
	}

	public void setDates(Set dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "StudentContactDetails [number=" + number + ", dates=" + dates + "]";
	}
}