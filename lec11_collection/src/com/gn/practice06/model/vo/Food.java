package com.gn.practice06.model.vo;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	
	public Food() {
		this("기본 정식", 10000);
	}
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Food) {
			Food other = (Food) obj;
			result = this.name.equals(other.name) && this.price == other.price;
		}
		
		return result;
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Food other = (Food) obj;
//		return Objects.equals(name, other.name) && price == other.price;
	}
	@Override
	public String toString() {
		return name + ":" + price;
	}
}
