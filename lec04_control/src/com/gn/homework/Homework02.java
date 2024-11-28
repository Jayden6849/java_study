package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		System.out.println("=== 일기예보 ===");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		double temp = sc.nextDouble();
		
		if(month == 1 || month == 2 || month == 12) {
			if(temp <= -15) {
				System.out.println("겨울 한파 경보");
			} else if(temp <= -12) {
				System.out.println("겨울 한파 주의보");
			} else {
				System.out.println("겨울");
			}
		} else if (month == 6 || month == 7 || month == 8) {
			if(temp >= 35) {
				System.out.println("여름 폭염 경보");
			} else if(temp >= 33) {
				System.out.println("여름 폭염 주의보");
			} else {
				System.out.println("여름");
			}
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다. '월'을 확인해주세요.");
		}
		
		sc.close();
	}
}
