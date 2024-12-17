package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		
		String str1 = "";
		
//		for(int i=0; i<words.length; i++) {
//			if(i == words.length-1) {
//				str1 += words[i];
//			} else {
//				str1 += words[i] + " ";
//			}
//		}
		
		str1 = String.join(" ", words);
		
		System.out.println("문장 : " + str1);
		
		String str2 = "";
		
		for(int i=0; i<words.length; i++) {
			if(i==0) continue;
			str2 += words[i].substring(0,1);
		}
		
		System.out.println("변환 : " + str2.toUpperCase());
	}
}
