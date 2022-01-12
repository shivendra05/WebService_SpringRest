package com.prop;

import java.util.Properties;

public class Fruits {

	Properties fruits;

	public void setFruits(Properties fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "Fruits [fruits=" + fruits + "]";
	}
}