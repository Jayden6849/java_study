package com.gn.practice;

import java.util.Arrays;

public class Practice01 {
	public static void main(String[] args) {
//		String[] friends = new String[5];
//		
//		friends[0] = "박지영";
//		friends[1] = "김태우";
//		friends[2] = "이지훈";
//		friends[3] = "최유진";
//		friends[4] = "정승호";
		
		String[] friends = {
				"박지영", "김태우", "이지훈", "최유진", "정승호"
		};
		
		for(int i=0; i<friends.length; i++) {
			if(i%2!=0) continue;
			System.out.println((i+1) + " : " + friends[i]);
		}
		
		System.out.println(Arrays.toString(friends));
	}
}
