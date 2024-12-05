package com.gn.study.capsule;

import com.gn.study.capsule.open.Account1;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		
		// Setter :: id
		s.setId(2024120511);
		
		// Getter :: id
		int id = s.getId();
		System.out.println(id);
		
		Account1 a1 = new Account1("김철수", 20000000);
		a1.balance -= 50000000; // 잔액이 모자람에도 출금이 발생함 :: 필드의 무결성이 보장되지 못함.
		
		System.out.println(a1.balance);
	}
}
