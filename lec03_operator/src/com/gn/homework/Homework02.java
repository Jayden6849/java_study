package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int count = sc.nextInt();
		
		if(count < 1)
			System.out.println("양수를 입력해주세요");
		else
			System.out.println((count%2 == 0) ? "짝수" : "홀수");
		
		sc.close();
	}
}
