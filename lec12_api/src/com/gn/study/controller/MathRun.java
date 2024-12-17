package com.gn.study.controller;

public class MathRun {
	public static void main(String[] args) {
		// 1. abs
		int num = -37;
		System.out.println("abs("+num+") = "+Math.abs(num));
		
		// 2. pow
		double pow = Math.pow(5,2);
		System.out.println(pow);
		
		// 3. round
		final double PI = 3.141592653578;
		long round = Math.round(PI * Math.pow(10, 3));
		System.out.println("PI(소수점 3자리까지) = " + round/Math.pow(10,3));
		
		double after = Math.round(PI*100.0)/100.0;
		System.out.println(after);
	}
}
