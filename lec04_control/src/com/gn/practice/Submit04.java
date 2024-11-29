package com.gn.practice;

import java.util.Scanner;

public class Submit04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("1-3 사이의 정수를 입력하셔야합니다.");
		}
		sc.close();
	}
}
