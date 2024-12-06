package com.gn.practice01.model.vo;

public class Employee {
	protected String name;
	
	public Employee() {
		super();
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("직원 이름 : " + name);
	}
}
