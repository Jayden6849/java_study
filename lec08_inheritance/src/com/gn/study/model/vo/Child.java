package com.gn.study.model.vo;

public class Child extends Parent {
	private int b;

	public Child() {
		super();
		System.out.println("자식의 기본 생성자 호출");
	}
	public Child(int b) {
		super();
		System.out.println("자식의 매개변수 생성자 호출");
		this.b = b;
	}

	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
