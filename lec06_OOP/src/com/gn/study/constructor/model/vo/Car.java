package com.gn.study.constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
	public Car() {
		this("HYUNDAE", "gray", 1976);
	};
	
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
	
	// getter, setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
