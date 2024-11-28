package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("true 또는 false을(를) 입력해주세요 : ");
		boolean input = sc.nextBoolean();
		System.out.println(!input);
		
		sc.close();
	}
}
