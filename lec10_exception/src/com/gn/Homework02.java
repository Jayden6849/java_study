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
		this("원인을 알 수 없는 오류가 발생했습니다.");
	}
	
	public UnSupportedException(String msg) {
		super(msg);
	}
}