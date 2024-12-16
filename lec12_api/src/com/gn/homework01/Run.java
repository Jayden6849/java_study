package com.gn.homework01;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] strArr = str.split("\n");
		System.out.println(Arrays.toString(strArr));
		
		
		
		for(int i=0; i<strArr.length; i++) {
			
		}
	}
}
