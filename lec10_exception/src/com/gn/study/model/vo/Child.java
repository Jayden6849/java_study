package com.gn.study.model.vo;

public class Child extends Parent {
	@Override
	public void method() throws IllegalArgumentException, ArithmeticException {
		try {
		System.out.println("차일드");
		} catch(NullPointerException ne) {
			System.out.println("NUllPointerException 은 처리되었습니다.");
		}
	}
}
