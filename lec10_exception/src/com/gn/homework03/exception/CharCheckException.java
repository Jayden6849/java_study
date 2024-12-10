package com.gn.homework03.exception;

public class CharCheckException extends Exception {
	/**
	 * 영문자가 아닐 때 발생하는 예외입니다.
	 */
	private static final long serialVersionUID = 1L;
	
	public CharCheckException() {
		super();
	}
	public CharCheckException(String msg) {
		super(msg);
	}
}
