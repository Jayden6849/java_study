package com.gn.practice;

import java.util.Scanner;

public class Submit05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		String result = "";
		
		if(year%4 == 0) {
			result = "윤년";
			if(year%100 == 0) {
				result = "평년";
				if(year%400 == 0) {
					result = "윤년";
				}
			}
		} else {
			result = "평년";
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
