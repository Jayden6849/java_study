package com.gn.practice;

import java.util.Scanner;

public class Submit08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int sum = 0;
		if(input%2 == 0) {
			for(int i=2; i<=input; i+=2) {
				sum += i;
			}
		} else {
			for(int i=1; i<=input; i+=2) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		scan.close();
	}
}
