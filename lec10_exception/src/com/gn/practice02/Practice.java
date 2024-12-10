package com.gn.practice02;

public class Practice {
	public int printStrLength(String str) {
		try {
			return str.length();
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 발생 : " + ne.getMessage());
		}
		return -1;
	}
}
