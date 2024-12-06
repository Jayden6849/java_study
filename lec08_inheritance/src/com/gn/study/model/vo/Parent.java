package com.gn.study.model.vo;

public class Parent {
	private int a;
	
	public Parent() {
		super();
		System.out.println("부모의 기본 생성자 호출");
	}
	public Parent(int a) {
		super();
		System.out.println("부모의 매개변수 생성자 호출");
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
