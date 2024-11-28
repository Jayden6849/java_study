package com.gn.practice;

import java.util.Scanner;

public class Submit01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num == 0) System.out.println("영");
		else if(num > 0) System.out.println("양수");	
		else System.out.println("음수");
		
		scan.close();
	}
}
