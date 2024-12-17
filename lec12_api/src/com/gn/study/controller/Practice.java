package com.gn.study.controller;

public class Practice {
	// 매개변수로 전달받은 문자열을 StringBuiler로 append 후 문자열로 반환하는 메소드 
	public String append(String str) {
		StringBuilder sb = new StringBuilder("test");
		
		sb.append(str);
		
		return sb.toString();
	}
}
