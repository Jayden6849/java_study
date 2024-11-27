package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double weight = scan.nextDouble();
		System.out.print("키(m) : ");
		double height = scan.nextDouble();
		
		System.out.printf("BMI 지수 : %.1f\n", (weight/(height*height)));
		
		scan.close();
	}
}
