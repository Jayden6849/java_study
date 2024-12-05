package com.gn.practice07.model.vo;

public class Supplement {
	private String name;	// 이름
	private int number;		// 복용량
	private int price; 		// 가격
	
	public Supplement() {
		this(null, 0, 0);
	}
	public Supplement(String name, int number, int price) {
		this.name = name;
		this.number = number;
		this.price = price;
	}

	public void info() {
		System.out.println("이름: " + name + ", 복용량: " + number + "알, 가격: " + price + "원");
	}
}
