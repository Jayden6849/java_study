package com.gn.practice;

import java.util.Scanner;

public class Submit04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double base = scan.nextDouble();
		double height = scan.nextDouble();
		
		System.out.println((base*height)/2.0);
		
		scan.close();
	}
}
