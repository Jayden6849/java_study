package com.gn.study.capsule.open;

/**
 * 캡슐화가 제대로 되어있지 않은 케이스
 */

public class Account1 {
	public String user; // 예금의 소유주
	public int balance; // 예금의 잔액
	
	public Account1() {
		this("홍길동", 0);
	}
	public Account1(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
}
