package com.gn.practice06.model.vo;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	
	public Food() {
		super();
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	@Override
	public String toString() {
		return name + ":" + price;
	}
}
