package com.gn.homework01.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		super();
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String toString() {
		String result = "=== " + super.name + " ===" + "\n"
				+ "나이 : " + super.getAge() + "\n"
				+ "키 : " + super.getHeight() + "\n"
				+ "몸무게 : " + super.getWeight() + "\n"
				+ "학년 : " + grade + "\n"
				+ "전공 : " + major;
		return result;
	}
	
	// Getter, Setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}	
}
