package com.gn.homework10;

public class Main {
	public static void main(String[] args) {
		Account a1 = new Account("123-456-789", 100000);
		Account a2 = new Account("987-654-321", 50000);
		
		a1.withdraw(30000);
		a2.deposit(100000);
		
		Bank bank = new Bank();
		
		bank.transfer(a1, a2, 50000);
		
		System.out.println("(계좌)" + a1.getAccountNumber() + " : " + a1.getBalance() + "원(잔액)");
		System.out.println("(계좌)" + a2.getAccountNumber() + " : " + a2.getBalance() + "원(잔액)");
	}
}
