package com.gn.practice;

import java.util.Scanner;

public class Submit10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int leg = scan.nextInt();
				
//		total = puppy + chick
//		leg = puppy * 4 + chick * 2
		
		String result = "계산불가";
		
		for(int i=0; i<=total; i++) {
			if((i*4 + (total-i)*2) == leg) {
				result = i + " " + (total-i);
			}
		}

		System.out.println(result);
		
		scan.close();
	}
}
