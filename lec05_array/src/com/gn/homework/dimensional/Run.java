package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 키 순서대로 앉으세요.");
		System.out.println("2. 값 입력 받아 배열 만들기");
		System.out.println("3. 올라갔다 내려갔다");
		System.out.println("5. 컴퓨터와 가위바위보");
		
		Practice p = new Practice();
		
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			p.practice01();
			break;
		case 2:
			p.practice02();
			break;
		case 3:
			p.practice03();
			break;
		case 5:
			break;
		}
		
		
		
		sc.close();
	}
}
