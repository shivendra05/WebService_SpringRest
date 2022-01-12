package com.bean;

import org.springframework.stereotype.Component;

@Component("Eng")
public class Engine {
	Engine(){
		System.out.println("Engine.Engine():: 0- param constructor");
	}
	public void startEngine() {
		System.out.println("Engine.startEngine()");
	}

	public void stopEngine() {
		System.out.println("Engine.stopEngine()");
	}

	public void startjourney() {
		System.out.println("Engine.startjourney()");
	}
}