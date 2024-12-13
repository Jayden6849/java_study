package com.gn.study.model.vo;

import java.util.Objects;

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
	
	// method
	@Override
	public String toString() {
		return "맛:"+flavor+", 칼로리:"+calory+"(kcal)";
	}
	@Override
	public int hashCode() {
		return Objects.hash(calory, flavor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return calory == other.calory && Objects.equals(flavor, other.flavor);
	}
}
