package com.gn.study.controller;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp" + " ";
		
		char[] chArr = my_string.replaceAll("[^0-9]", " ").toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		String result = "";

		for(int i=0; i<chArr.length; i++) {
			if(!(chArr[i] == ' '))
				if(chArr[i+1] == ' ') {
					result += chArr[i] + " ";
				} else {
					result += chArr[i];					
				}
		}
		System.out.println(result);
		
		String[] answer = result.split(" ");
		
		System.out.println(Arrays.toString(answer));
		
		int sum = 0;
		for(int i=0; i<answer.length; i++) {
			sum += Integer.parseInt(answer[i]);
		}
		System.out.println(sum);
	}
}
