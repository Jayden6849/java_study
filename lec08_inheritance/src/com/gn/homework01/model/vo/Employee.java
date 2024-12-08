package com.gn.homework01.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age ,height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		String result = "=== " + super.name + " ===" + "\n"
				+ "나이 : " + super.getAge() + "\n"
				+ "키 : " + super.getHeight() + "\n"
				+ "몸무게 : " + super.getWeight() + "\n"
				+ "급여 : " + salary + "\n"
				+ "부서 : " + dept;
		return result;
	}
	
	// Getter, Setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
