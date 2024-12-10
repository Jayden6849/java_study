package com.gn.study.controller;

import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.User;

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
		
		System.out.println("=== NullPointerException === ");
		
		String[] arr = new String[3];

		try {
			System.out.println(arr[0].length()); // 배열의 0번은 초기화가 되어있지 않아서 null - 여기에 .length() 메소드를 사용함  
		} catch(NullPointerException npe) {
			System.out.println("Exception :: 객체가 null 상태입니다.");
		}
		
		System.out.println("=== ArrayIndexOutOfBoundsException === ");
		
		int[] numbers = {1, 2, 3};
		
		try {
			System.out.println(numbers[3]); // 배열이 인덱스 2번까지밖에 없는데 3번에 접근하려함
		} catch (IndexOutOfBoundsException ioe) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요!!");
		}
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		System.out.println("=== throw new Excetpion(예외메시지) === ");
		
		User user = new User();
		try {
			user.checkAge(14);
		} catch(IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		try {
		user.nameLength(null); // NullPointerException
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println("Throws checked");
	}
}
