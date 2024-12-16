package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		
		String str1 = "";
		
		for(int i=0; i<words.length; i++) {
			if(i == words.length-1) {
				str1 += words[i];
			} else {
				str1 += words[i] + " ";
			}
		}
		System.out.println("문장 : " + str1);
		
		String str2 = "";
		
		str2 = str1.substring(5, 6) + str1.substring(17, 18) + str1.substring(29, 30);
		
		System.out.println("변환 : " + str2.toUpperCase());
	}
}
