package com.gn;

public class Homework02 {
	public static void main(String[] args) throws UnSupportedException {
		throw new UnSupportedException();
	}
}

class UnSupportedException extends Exception {
	/**
	 * 임의로 지정된 예외입니다.
	 */
	private static final long serialVersionUID = 1L;
	
	public UnSupportedException() {
		super();
	}
}