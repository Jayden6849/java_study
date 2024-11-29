package com.gn.practice;

public class Practice09 {
	public static void main(String[] args) {
		int count = 0;
		while(true)
		{
			System.out.println("반복 횟수: " + (count+1));
			count++;
			if(count > 4) break;
		}
		System.out.println("반복 종료!");
	}
}
