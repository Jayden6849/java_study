package com.gn.study.constructor.model.vo;

public class Book {
	private final int price;
	
	public Book(int price) {
		this.price = price;
	}

	// getter, setter
	public int getPrice() {
		return price;
	}
}
