package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		// 철수가 여권을 만드려고 합니다.
		// 영어이릅 : Chulsu 가 맞나요?
		// 나이 : 20대이신가요? 그러면 할인해드려요
		
		Scanner sc = new Scanner(System.in);
				
		// 1. 철수의 영어이름과 나이 정보를 입력받습니다.
		System.out.print("영어이름을 입력해주세요(대소문자구분) : ");
		String engName = sc.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		// 2. 3가지 논리형 데이터를 출력
		// (1) 영어이름이 일치하나요? true or false
		boolean isName = "Chulsu".equals(engName);
		System.out.println("영어 이름이 일치하나요? " + isName);
		
		// (2) 20대인가요? true or false
		boolean isAge = (20 <= age) && (age < 30);
		System.out.println("20대인가요? " + isAge);
		
		// (3) 영어 이름이 일치하면서, 동시에 20대인가요?
		boolean isChecked = (isName && isAge);
		System.out.println("영어 이름이 일치하면서 동시에 20대인가요? " + isChecked);
		
		sc.close();
	}
}
