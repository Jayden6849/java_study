package com.gn.study.controller;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			System.out.println(a/b); // ArithmeticException :: 0으로 나누었을 때 발생하는 예외			
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나누면 안 돼요!!");
		} finally {
			System.out.println("계산끝!!");
		}
		System.out.println(a+b);
	}
}
