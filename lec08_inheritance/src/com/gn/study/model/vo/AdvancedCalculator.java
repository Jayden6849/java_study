package com.gn.study.model.vo;

public final class AdvancedCalculator extends BasicCalculator {
//	@Override
//	public final int add(int a, int b) {
//		return a+b;
//	}
//  :: cannot override the final method
	
	@Override
	public int subtract(int a, int b) {
		return (a>=b) ? a-b : b-a;
	}
}
