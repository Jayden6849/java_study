package com.gn.homework04.controller;

public class ExMethodController {
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
	public int sumOneToHundred() {
		int result = 0;
		for(int i=0; i<100; i++) {
			result += (i+1);
		}
		return result;
	}
	
	public String judgeOddEven(int num) {
		if(num%2 == 0) return "짝수";
		else return "홀수";
	}
	
	public boolean containsEng(String str) {
		char[] chArr = str.toCharArray();
		
		boolean result = false;
		for(char c : chArr) {
			if(!('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z')) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		
		return result;
	}
	
	public int countChar(String str, char c) {
		char[] chArr = str.toCharArray();
		
		int cnt = 0;
		for(char ch : chArr) {
			if(ch == c) cnt++;
		}
		
		return cnt;
	}
	
	public void gugudan(int dan) {
		if(dan < 2 || 9 < dan) {
			System.out.println("구구단은 2단부터 9단까지 있습니다.");
			return;
		}
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
}
