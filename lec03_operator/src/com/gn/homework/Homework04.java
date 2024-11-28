package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		double total = kor + math + eng;
		double average = total/3.0;
		
		System.out.printf("합계: %.0f점\n", total);
		System.out.printf("평균: %.0f점\n", average);
		
		if ((kor >= 60 && math >= 60 && eng >= 60) && average > 90) {
			System.out.println("휴대폰을 바꿀 수 있습니다.");
		} else {
			System.out.println("휴대폰을 바꿀 수 없습니다.");
		}
		
		sc.close();
	}
}
