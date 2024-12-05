package com.gn.homework10;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
		if(sender.getBalance()-amount >= 0) {
			sender.withdraw(amount);
			receiver.deposit(amount);
		}
	}
}
