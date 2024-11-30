package com.gn.practice;

import java.util.Scanner;

public class Submit14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		String sum = "";
		int total = 0;
		
		int i, j;
		for(i=1; i<=input; i++) {
			for(j=1; j<=i; j++) {
				if(i==1 && j==1) {
					sum += "(" + j + ")";
				} else if(j==1) {
					sum += "(" + j + "+";
				} else if(j==i) {
					sum += j + ")";
				} else {
					sum += j + "+";
				}
				
				if(i==input) {}
				else if(i==j) sum += "+";
				total += j;
			}
		}
		System.out.println(sum+"="+total);
		
		scan.close();
	}
}
