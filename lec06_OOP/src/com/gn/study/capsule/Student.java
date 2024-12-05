package com.gn.study.capsule;

public class Student {
	private int id;
	
	public Student() {
		this(0000000000);
	}
	public Student(int id) {
		this.id = id;
	}
	
	// getter, setter
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		if((id+"").length() == 10) this.id = id;
		else {
			System.out.println("입력하신 id가 형식에 맞지 않습니다.");
			this.id = -1;
		}
	}
}
