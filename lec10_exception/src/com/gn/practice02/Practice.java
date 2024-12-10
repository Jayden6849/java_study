package com.gn.practice02;

public class Practice {
	public void printStrLength(String str) {
		try {
			System.out.println(str.length());
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 발생 : " + ne.getMessage());
		}
	}
}
