package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자: ");			
			
			int input = sc.nextInt();
			if(input < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			} else if(input > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else if(input == 0) {
				sc.close();
				break;
			} else {
				for(int i=input; i<=9; i++) {
					System.out.println("=== " + i + "단 ===");
					for(int j=1; j<=9; j++) {
						System.out.println(i + " * " + j + " = " + (i*j));						
					}
				}
			}
		}
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			if("탈출".equals(input)) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			} else {
				System.out.println(input);
			}			
		}
	}
	
	public void practice06() {
		String tree = "";
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				tree += " ";
			}
			for(int j=1; j<=(i*2-1); j++) {
				tree += "*";
				if(j==i*2-1) {
					tree += "\n";
				}
			}
		}
		System.out.println(tree);
	}
	
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input <= 0)
			System.out.println("양수가 아닙니다.");
		else {
			for(int i=1; i<=input; i++) {
				if(i%2 == 1) System.out.print("박");
				else System.out.print("수");
			}
		}
		
		sc.close();
	}
}
