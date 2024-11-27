package com.gn.study;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// 1. 산술연산자
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.printf("%.3f\n", num1/(double)num2);
		
		// 2. 복합대입연산자
		int a = 5;
		System.out.println("a = " + a);
		a += 3;
		System.out.println("a = " + a); // 8
		
		int b = 10;
		System.out.println("b = " + b);		
		b -= 4;
		System.out.println("b = " + b); // 6
		b*=5;
		System.out.println("b = " + b); // 30
		
		int c = 10;
		c /= 3;
		System.out.println("c = " + c); // 3
		
		int d = 10;
		d %= 3;
		System.out.println("d = " + d); // 1
	}
}
