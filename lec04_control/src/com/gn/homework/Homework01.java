package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int fee = 0;
		
		if (age < 3) {
			fee = 0;
		} else if (age <= 12) {
			fee = 10000;
		} else if (age <= 18) {
			fee = 20000;
		} else if (age <= 64) {
			fee = 30000;
		} else {
			fee = 0;
		}
		
		System.out.println("당신의 놀이동산 요금은 " + fee + "원입니다.");
		
		sc.close();
	}
}
