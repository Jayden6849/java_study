package com.gn.study.model.vo;

public class Beverage {
	private String name;
	private int volume;
	
	public Beverage() {
		this("아이스 아메리카노", 250);
	}
	public Beverage(String name, int volume) {
		super();
		this.name = name;
		this.volume = volume;
	}
	
	public void printInfo() {
		System.out.println("- 이름 : " + name);
		System.out.println("- 용량 : " + volume);
	}
}
