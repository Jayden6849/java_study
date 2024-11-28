package com.gn.study;

public class LogicalOperator {
	public static void main(String[] args) {
		// 1. 논리연산자
		int a = 6; int b = 5; int c = 7;
		
		// (1) and :: 6은 5보다 크고, 6은 7보다 큰가요?
		boolean andBool = (a > b) && (b > c);
		System.out.println(andBool); // false
		
		// (2) or :: 6은 5보다 크거나, 6은 7보다 큰가요?
		boolean orBool = (a > b) || (b > c);
		System.out.println(orBool); // true
		
		// (3) xor :: 6은 5보다 크고, 6은 7보다 큰가요? 또는 6은 5보다 작고, 6은 7보다 작나요?
		boolean xorBool = (a > b) ^ (b > c);
		System.out.println(xorBool); // true
		
		// (4) ! :: 논리부정연산자
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
		boolean test1 = 3 < 5;
		boolean test2 = 6 < 5;
		
		System.out.println(test1 && test2); // false :: true && false
		System.out.println(test1 && !test2); // true :: true && !false
		System.out.println(!(test1 && test2)); // true :: !(true && false)
	}
}
