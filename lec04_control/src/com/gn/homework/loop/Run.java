package com.gn.homework.loop;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 입력하세요.");
		
		System.out.println("1. 1~50까지 짝수 합하기");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("4. 게임 재시작");
		System.out.println("5. 양수만 더하기");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.println("8. 문자열의 개수");
		
		System.out.print("선택: ");
		int menu = sc.nextInt();
		
		Practice p = new Practice();
		
		switch (menu) {
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
