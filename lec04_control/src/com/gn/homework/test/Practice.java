package com.gn.homework.test;

import java.util.Scanner;

public class Practice {
	// Method
	// 1. 인사말을 출력하는 기능(메소드)
	public void greet() {
		System.out.println("안녕하세요~");
	}
	
	// 2. 두개의 숫자를 입력 받아서 합을 출력하는 기능
	public void scanAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		
		sc.close();
	}
}
