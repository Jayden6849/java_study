package com.gn.study.model.vo;

public class Calculator {
	public int divide(int a, int b) {
		int result = -1;
		
		try {
			result = a/b;
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
		}
		
		System.out.println("try-catch checked");
		return result;
	}
}
