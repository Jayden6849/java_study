package com.gn.practice;

import java.util.Scanner;

public class Submit05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.141592;
		
		double r = scan.nextDouble();
		double circum = (r + r) * PI; 
		double area = (r * r) * PI;

		System.out.println("둘레:"+circum);
		System.out.println("넓이:"+area);
		
		scan.close();
	}
}
