package com.gn.practice03.exception;

public class InvalidCredentialsException extends Exception {
	/**
	 * 로그인 시 아이디와 비밀번호가 일치하지 않을 경우 발생하는 예외입니다. 
	 */
	private static final long serialVersionUID = 259954042267063645L;

	public InvalidCredentialsException() {
		super();
	}
	
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}
