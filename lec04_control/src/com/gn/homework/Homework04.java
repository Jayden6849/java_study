package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		System.out.println("=== 합격인가? 불합격인가? ===");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("각 과목의 점수를 입력하세요.");
		
		System.out.print("소프트웨어설계 점수: ");
		int design = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int dev = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int data = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int language = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int system = sc.nextInt();

		double average = (design + dev + data + language + system)/5.0;
		
		if(design < 40 || dev < 40 || data < 40 || language < 40 || system < 40) {
			if(design < 40) {
				System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
			}
			if(dev < 40) {
				System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
			}
			if(data < 40) {
				System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");	
			}
			if(language < 40) {
				System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
			}
			if(system < 40) {
				System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
			}
		} else if(average < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다.");
		}
		
		sc.close();
	}
}
