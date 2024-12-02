package com.gn.practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("숫자(종료:99) : ");
			int input = sc.nextInt();
			
			do {
				System.out.println(input);
				input++;
			} while(input <= 10);
			
			if(input == 100) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
		} while(true);
	}
}
