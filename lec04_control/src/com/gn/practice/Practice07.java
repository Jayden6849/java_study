package com.gn.practice;

public class Practice07 {
	public static void main(String[] args) {
		// 구구단
		for(int i=2; i<=9; i++) { 					// 2 - 9단
			System.out.println("==="+i+"단===");
			for(int j=1; j<=9; j++) { 				// *1 - *9
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}
