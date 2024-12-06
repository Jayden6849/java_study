package com.gn.practice02.controller;

import com.gn.practice02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Appliance app = new Appliance();
		WashingMachine wm = new WashingMachine();
		Refrigerator refrigerator = new Refrigerator();
		
		app.turnOn();
		wm.turnOn();
		refrigerator.turnOn();
	}
}
