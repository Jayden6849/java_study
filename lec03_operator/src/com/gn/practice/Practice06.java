package com.gn.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
//		int result1 = (num1 < num2) ? num1 : num2;
//		System.out.println("두 수 중에서 작은 수는? " + result1);
		
		int result2 = (num1 > num2) ? ((num1 > num3) ? num1 : num2) : ((num2 > num3) ? num2 : num3);
		System.out.println("세 수 중에서 가장 큰 수는? " + result2);
		int result3 = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
		System.out.println("세 수 중에서 가장 작은 수는? " + result3);
		} catch (InputMismatchException ime) {
			sc.nextLine();
			System.out.println("올바른 정수를 입력해주세요.");
		}
		
		sc.close();
	}
}
