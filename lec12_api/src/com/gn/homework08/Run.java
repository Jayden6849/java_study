package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수점이 있는 숫자: ");
		double number = sc.nextDouble();
		sc.nextLine();
		System.out.print("10의 제곱수: ");
		int exponent = sc.nextInt();
		sc.nextLine();
		
		double answer = (Math.round(number * Math.pow(10, exponent))/Math.pow(10, exponent));
		
		System.out.print("반올림된 결과: " + answer);
		
		sc.close();
	}
}
