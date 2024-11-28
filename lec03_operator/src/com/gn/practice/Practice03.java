package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자(1) : ");
		int num1 = sc.nextInt();
		System.out.print("숫자(2) : ");
		int num2 = sc.nextInt();
		
		boolean isGreater = (num1 > num2);
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? " + isGreater);
		
		sc.close();
	}
}
