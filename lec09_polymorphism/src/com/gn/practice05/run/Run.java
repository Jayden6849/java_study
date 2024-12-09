package com.gn.practice05.run;

import com.gn.practice05.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnOff();
	}
}
