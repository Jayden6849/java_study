package com.gn.study.model.vo;

public interface Child01 extends Parent01, Parent02 {
	@Override
	default void test() {
		
	}
}
