package com.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.FactoryBean;

public class GenerateDate implements FactoryBean<LocalDate>{
	int year;
	int month;
	int day;

	public GenerateDate(int year, int month, int day) {
		System.out.println("GenerateDate:: 3 args Construtor");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public LocalDate getObject() throws Exception {
		return LocalDate.of(year, month, day);
	}

	@Override
	public Class<?> getObjectType() {
		return LocalDate.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
