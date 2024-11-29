package com.gn.practice;

import java.util.Scanner;

public class Submit09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int sum = 0;
		while(true) {
			sum += input%10;
			input /= 10;
			if(input == 0) break;
		}
		System.out.println(sum);
		
		scan.close();
	}
}
