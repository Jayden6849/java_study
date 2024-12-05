package com.gn.study.capsule;

import com.gn.study.capsule.closed.Account2;
import com.gn.study.capsule.open.Account1;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		
		// Setter :: id
		s.setId(2024120511);
		
		// Getter :: id
		int id = s.getId();
		System.out.println(id);
		
		// 캡슐화가 이루어지지 않은 케이스
		System.out.println("=== uncapsuled ===");
		Account1 a1 = new Account1("김철수", 20000000);
		a1.balance -= 50000000; // 잔액이 모자람에도 출금이 발생함 :: 필드의 무결성이 보장되지 못함.
		
		System.out.println(a1.balance);
		
		// 캡슐화가 이루어진 케이스
		System.out.println("=== capsuled ===");
		Account2 a2 = new Account2("김철수", 20000000);
//		a2.balance -= 50000000; // 캡슐화되어 있기때문에 필드에 직접 접근하는게 불가능함
		System.out.println(a2.getBalance());
		a2.deposit(10000000);
		System.out.println(a2.getBalance());
		a2.withdraw(50000000);
		System.out.println(a2.getBalance());
	}
}
