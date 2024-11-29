package com.gn.homework.test;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// Practice 가 public 이어서 별다른 임포트없이 가져옴
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요(종료:99) : ");
		System.out.println("1. 인사하기");
		System.out.println("2. 두 정수의 합 구하기");
		System.out.println();
		
		System.out.print("*** 입력란 : ");
		int input = sc.nextInt();

		Practice p = new Practice();
		
		switch(input) {
		case 1:
			p.greet();
			break;
		case 2:
			p.scanAdd();
			break;
		case 99:
			System.out.println("프로그램 종료");
			break;
		}
		
		sc.close();
	}
}
