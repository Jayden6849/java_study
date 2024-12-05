package com.gn.study.arr.model.vo;

public class Academy {
	// field
	private String name;
	private String phone;
	
	// constructor
	public Academy() {
		this("Default", "000-000-0000");
	}
	public Academy(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}
}
