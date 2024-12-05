package com.gn.study.capsule.closed;

/**
 * 캡슐화가 제대로 되어있는 케이스
 */

public class Account2 {
	private String user;
	private int balance;
	
	// constructor
	public Account2() {
		this("홍길동", 0);
	}
	public Account2(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	
	// getter, setter
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		if(this.balance-money >= 0) this.balance -= money;
		else System.out.println("잔액이 부족합니다.");
	}
	
	
}
