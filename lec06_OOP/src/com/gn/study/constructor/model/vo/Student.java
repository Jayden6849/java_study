package com.gn.study.constructor.model.vo;

public class Student {
	private String name;
	private int id;
	
	public Student(){
		this("홍길동", 0000000000);
	}
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo(int id) {
		this.id = id;
		System.out.println("당신의 번호는 " + this.id + "입니다.");
	}
	public void printInfo(String name) {
		this.name = name;
		System.out.println("당신의 이름은 " + this.name + "입니다.");
	}
	public void printInfo(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println(this.name + "님의 학번은 " + this.id + "입니다.");
	}	
}
