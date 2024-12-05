package com.gn.homework10;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {
		super();
	}
	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		if(balance - amount >= 0) {
			balance -= amount;
		}
	}
}
