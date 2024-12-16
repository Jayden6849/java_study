package com.gn.study.controller;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		
		char[] chArr = my_string.replaceAll("[^0-9]", " ").toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		String result = "";
		String[] strArr = new String[chArr.length];
		for(int i=0; i<chArr.length; i++) {
			
			
		}
	}
}
