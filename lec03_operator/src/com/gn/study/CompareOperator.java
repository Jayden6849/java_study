package com.gn.study;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;

		// 1. 등호
		System.out.println(num1==num2); // false
		System.out.println(num1!=num2); // true
		
		boolean same = (num1 == num2);
		System.out.println(same);
		boolean diff = (num1 != num2);
		System.out.println(diff);
		
		// 2. 부등호
		boolean big = (num1 > num2);
		System.out.println(big);
		boolean small = (num1 < num2);
		System.out.println(small);
		
		boolean bigSame = (num1 >= num2);
		System.out.println(bigSame);
		boolean smallSame = (num1 <= num2);
		System.out.println(smallSame);
		
		

	}
}
