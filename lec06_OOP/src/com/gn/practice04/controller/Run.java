package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.startEngine();
		
		System.out.println("기본 속도는 " + c1.checkSpeed() + "km/h 입니다.");
		
		c1.setSpeed(150);
		
		System.out.println(c1.setDestination("부산"));
	}
}
