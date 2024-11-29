package com.gn.practice;

public class Submit11 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; ;i++) {
			sum += i;
			if(sum > 1000) break;
		}
		
		System.out.println(i + "까지의 합:" + sum);
	}
}
