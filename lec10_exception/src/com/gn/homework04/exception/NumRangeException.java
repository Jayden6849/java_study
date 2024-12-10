package com.gn.homework04.exception;

public class NumRangeException extends Exception {
	/**
	 * 1~100 사이가 아닐 때 발생시킬 임의의 예외
	 */
	private static final long serialVersionUID = 1L;
	public NumRangeException() {
		super();
	}
	public NumRangeException(String msg) {
		super(msg);
	}
}
