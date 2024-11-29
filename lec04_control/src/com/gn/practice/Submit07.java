package com.gn.practice;

import java.util.Scanner;

public class Submit07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
