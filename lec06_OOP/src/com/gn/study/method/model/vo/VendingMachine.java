package com.gn.study.method.model.vo;

public class VendingMachine {
	// field
	private int balance;
	private String[] sodaList = {"사이다", "콜라", "밀키스", "오렌지주스"};
	
	// constructor
	VendingMachine() {
		this(500);
	}
	
	VendingMachine(int balance) {
		this.balance = balance;
	}
	
	// method
	
	// 1. 인사
	public void greet() {
		System.out.println("어서오세요!!");
	}
	
	// 2. 잔돈 반환해주기
	public int getBalance() {
		return balance;
	}
	
	// 3. 어떤 음료수들이 있는지 반환해주기
	public String[] getSodaList() {
		return sodaList;
	}
	
	// 4. 선택된 음료수 객체를 반환해주기
	public Soda selectedSoda() {
		Soda s1 = new Soda();
		return s1;
	}	
}
