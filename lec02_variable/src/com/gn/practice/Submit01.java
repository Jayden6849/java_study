package com.gn.practice;

import java.util.Scanner;

public class Submit01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println(a+", "+b);
		
		scan.close();
	}
}
