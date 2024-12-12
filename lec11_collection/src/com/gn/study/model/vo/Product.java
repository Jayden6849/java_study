package com.gn.study.model.vo;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private int price;
		
	public Product() {
		super();
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// Getter, Setter
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
		return name + "(" + price + "원)";
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
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	@Override
	public int compareTo(Product other) {
		if(this.price > other.price) return 1;
		else if(this.price < other.price) return -1;
		else return 0;
	}
}
