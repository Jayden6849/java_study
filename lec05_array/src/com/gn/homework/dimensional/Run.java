package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 키 순서대로 앉으세요.");
		System.out.println("2. 값 입력 받아 배열 만들기");
		System.out.println("3. 올라갔다 내려갔다");
		System.out.println("4. 로또 번호 자동 생성기");
		System.out.println("5. 컴퓨터와 가위바위보");
		System.out.println("6. 배열 늘리기");
		System.out.println("7. 문서 복사하기");
		System.out.println("8. 오늘의 메뉴판 만들기");
		
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
		case 4:
			p.practice04();
			break;
		case 5:
			p.practice05();
			break;
		case 6:
			p.practice06();
			break;
		case 7:
			p.practice07();
			break;
		case 8:
			p.practice08();
			break;
		}
		
		sc.close();
	}
}