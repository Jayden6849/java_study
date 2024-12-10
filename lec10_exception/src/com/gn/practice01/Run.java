package com.gn.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		sc.nextLine();
	
		Practice p = new Practice();
	
		try {
			System.out.println("합 : " + p.add(a, b));
			System.out.println("곱 : " + p.multiple(a, b));
			System.out.println("나누기 : " + p.divide(a, b));
		} catch(ArithmeticException ae) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		} finally {
			System.out.println("마지막까지 잘 도착했어요!!");
			sc.close();
		}
	}
}
