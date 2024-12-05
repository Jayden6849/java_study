package com.gn.practice06.model.vo;

public class Person {
	// field
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// constructor
	public Person() {}

	// method
	public String information() {
		String result = "id : " + getId() + "\n"
				+ "pwd : " + getPwd() + "\n"
				+ "name : " + getName() + "\n"
				+ "age : " + getAge() + "\n"
				+ "gender : " + getGender() + "\n"
				+ "phone : " + getPhone() + "\n"
				+ "email : " + getEmail();
		return result;
	}
	
	// getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
