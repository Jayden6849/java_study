package com.gn.practice;

public class Exercise01 {
	public static void main(String[] args) {
		int num1 = 110;
		int num2 = 9;
		
		int num3 = add(num1, num2);
		int num4 = multiply(num2, num3);
		int num5 = divide(num4, num2);

		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}

	private static int divide(int num1, int num2) {
		return (int)(num1/num2);
	}
	
	private static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	private static int add(int num1, int num2) {
		return num1 + num2;
	}
}
