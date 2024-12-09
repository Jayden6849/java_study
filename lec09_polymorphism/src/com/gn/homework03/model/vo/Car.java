package com.gn.homework03.model.vo;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public void startEngine() {
		engine.start();
	}
}
