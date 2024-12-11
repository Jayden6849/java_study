package com.gn.study.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Practice p = new Practice();
		
		System.out.print("첫번째 : ");
		String num1 = sc.next();
		sc.nextLine();
		
		System.out.print("두번째 : ");
		String num2 = sc.next();
		sc.nextLine();
		
		System.out.print("합 : " );
		try {
			p.printSum(num1, num2);
		} catch(NumberFormatException nfe) {
			System.out.println();
			System.out.println( "(* ERROR :: 숫자를 입력하셔야합니다.)");
		}
		
		sc.close();
	}
}
