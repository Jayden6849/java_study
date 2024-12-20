package com.gn.homework01.model.vo;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		super();
	}
	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		String result = "=== " + name + " ===" + "\n"
				+ "나이 : " + age + "\n"
				+ "키 : " + height + "\n"
				+ "몸무게 : " + weight;
		return result;
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
