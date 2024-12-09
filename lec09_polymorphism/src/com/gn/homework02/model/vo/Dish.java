package com.gn.homework02.model.vo;

public class Dish extends Menu {
	private String ingredients;
	
	public Dish() {
		super();
	}
	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public void cook() {
		System.out.println("======");
		System.out.println(toString() + " >> 재료는 " + ingredients + "입니다.");
		System.out.println(super.getName()+"을(를) 조리합니다.");
	}
}
