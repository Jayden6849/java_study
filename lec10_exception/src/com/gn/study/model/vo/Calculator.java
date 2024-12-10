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
		} catch(RuntimeException re) {
			re.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.print("finally ");
		}
		
		System.out.println("try-catch checked");
		return result;
	}
}
