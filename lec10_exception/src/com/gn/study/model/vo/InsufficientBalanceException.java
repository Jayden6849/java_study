package com.gn.study.model.vo;

public class InsufficientBalanceException extends Exception {
	/**
	 * 잔액이 부족할 때 출금하려 할 경우 발생하는 예외입니다.
	 */
	private static final long serialVersionUID = -7939672243563749797L;

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
