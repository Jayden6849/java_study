package com.gn.practice;

import java.util.Scanner;

public class Submit02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println((num/10)*10);
		
		scan.close();
	}
}
