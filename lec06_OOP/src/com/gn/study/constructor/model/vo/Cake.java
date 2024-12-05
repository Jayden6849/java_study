package com.gn.study.constructor.model.vo;

public class Cake {
	private String flavor = "초코";
	private static int price = 20000;
	
	{flavor = "딸기";}
	static {price = 22000;}
	
	public Cake() {
		this.flavor = "바나나";
//		this.price = 25000;
	}
	
	// getter, setter
	public String getFlavor() {
		return flavor;
	}
	public int getPrice() {
		return price;
	}
}
