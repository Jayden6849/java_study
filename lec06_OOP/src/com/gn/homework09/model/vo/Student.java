package com.gn.homework09.model.vo;

public class Student {
	private int no;
	private String name;
	private char className;
	
	private static int cnt;
	
	public Student() {
		super();
		cnt++;
		no = cnt;
	}
	
	public int getNo() {
		return no;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getClassName() {
		return className;
	}
	public void setClassName(char className) {
		this.className = className;
	}
}
