package com.gn.study.model.vo;

public class Account {
	private String user;
	private int balance;
	
	public Account() {
		super();
	}
	public Account(String user, int balance) {
		super();
		this.user = user;
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance)
			throw new InsufficientBalanceException("잔액이 부족합니다");
		balance -= amount;
		System.out.println(user + "님의 계죄에서 " + amount + "원이 출금되었습니다.");
	}
	
	public int getBalance() {
		return balance;
	}
}
