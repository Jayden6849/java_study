package com.gn.homework02.model.vo;

public class Drink extends Menu {
	private String recipe;
	
	public Drink() {
		super();
	}
	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}
	
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public void cook() {
		System.out.println("======");
		System.out.println(toString() + " >> 레시피는 "+recipe+"입니다.");
		System.out.println(super.getName()+"을(를) 만듭니다.");
	}
}
