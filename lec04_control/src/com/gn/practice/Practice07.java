package com.gn.practice;

public class Practice07 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("==="+i+"단===");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		external:
		for(int i=2; i<=9; i++) {
			System.out.println("==="+i+"단===");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
				if(i*j == 27) break external;
			}
		}
	}
}
