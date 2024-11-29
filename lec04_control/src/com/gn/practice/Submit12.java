package com.gn.practice;

import java.util.Scanner;

public class Submit12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=input; i++) {
			if(i%2 == 0 || i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		scan.close();
	}
}
