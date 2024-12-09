package com.gn.homework02.model.vo;

public abstract class Menu {
	private String name;
	private int price;
	
	protected Menu() {
		super();
	}
	protected Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "메뉴명은 "+name+"이고, 가격은 "+price+"원입니다.";
	}
	
	public abstract void cook();
}
