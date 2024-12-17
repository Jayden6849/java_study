package com.gn.homework10.controller;

public class BuilderController {

	public BuilderController() {
		super();
	}
	
	public String afterReplace(String str) {
		return str.replace(" ", "");
	}
	public String firstCap(String input) {
		String firstUpper = (input.charAt(0)+"").toUpperCase();
		
		StringBuilder sb = new StringBuilder(input);
		sb.delete(0, 1);
		sb.insert(0, firstUpper);
		return sb.toString();
	}
	public int findChar(String input, char one) {
		int cnt = 0;
		char[] chArr = input.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == one) cnt++;
		}
		return cnt;
	}
}
