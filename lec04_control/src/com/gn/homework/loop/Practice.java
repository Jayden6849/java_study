package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("정수(1~50) : ");
			int inputNum = sc.nextInt();
			
			if(inputNum < 1 || 50 < inputNum) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				continue;
			} else {
				for(int i=1; i<=inputNum; i++) {
					if(i%2==0) sum += i;
				}
				break;
			}
		}
		System.out.println("합계 : " + sum);
		
		sc.close();
	}
	
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
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("게임을 실행합니다!");
			
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			String input = sc.next();
			
			if("yes".equalsIgnoreCase(input)) {
				continue;
			} else if("no".equalsIgnoreCase(input)) {
				System.out.println("게임을 종료합니다.");
				sc.close();
				break;
			}			
		} while(true);
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int inputNum = sc.nextInt();
			
			if(inputNum == 0) {
				break;
			} else if(inputNum < 0) {
				continue;	
			} else {
				sum += inputNum;				
			}
		}
		
		System.out.println("양수의 합계 : " + sum);
		sc.close();
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
	
	public void practice08() {
		Scanner sc = new Scanner(System.in);
		
		exter:
		do {
			System.out.print("문자열 : ");
			String inputStr = sc.next();
			System.out.print("문자 : ");
			char inputChar = sc.next().charAt(0);
			
			int sum = 0;
			char[] chArr = inputStr.toCharArray();
			
			for(int i=0; i<chArr.length; i++) {
				if(chArr[i] == inputChar) sum += 1;
			}
			System.out.println("포함된 개수 : " + sum);
		
			do {
				System.out.print("다시 입력하시겠습니까? : ");
				String answer = sc.next();
				
				if("y".equalsIgnoreCase(answer)) {
					continue exter;
				} else if("n".equalsIgnoreCase(answer)) {
					sc.close();
					break exter;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
			} while(true);
		} while(true);
	}
}
