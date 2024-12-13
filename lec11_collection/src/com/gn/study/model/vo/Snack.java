package com.gn.study.model.vo;

public class Snack {
	// field
	private String flavor;
	private int calory;
	
	// constructor
	public Snack() {
		super();
	}
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	
	// getter, setter
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "맛:"+flavor+", 칼로리:"+calory+"(kcal)";
	}

	// method
	
}
