package com.gn.study.controller;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		// 1. 오토박싱과 언박싱
		Integer iNum1 = 100; 	// 오토박싱
		int iNum2 = iNum1; 		// 언박싱
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		// 2. parse 메소드
		System.out.println("===== parse =====");
		
		String str1 = "123";
		String str2 = "456";
		
		System.out.println(str1+str2);
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		
		str1 = "1.23";
		str2 = "4.56";
		
		System.out.println(str1+str2);
		System.out.println(Double.parseDouble(str1)+Double.parseDouble(str2));
		
		// 3. NumberFormatException
		System.out.println("===== NumberFormatException =====");
		
		String[] arrStr = new String[3];
		arrStr[0] = "일";
		arrStr[1] = "이";
		arrStr[2] = "삼";
		
		try {
			System.out.println(Integer.parseInt(arrStr[0]));
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		// 4. ClassCastException
		System.out.println("===== ClassCastException =====");
		
		Object obj = 9;
		int iObj = (int)obj;
		System.out.println(iObj);
		
		try {
			String strObj = (String)obj; // Integer 를 String 으로 바로 변환하려하면 예외가 발생함
			System.out.println(strObj);
		} catch(ClassCastException cce) {
			cce.printStackTrace();
		}
		
		// 컬렉션 프레임워크
		Collection<Integer> collection = new ArrayList<>();
		
	}
}
