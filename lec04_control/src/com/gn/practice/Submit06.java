package com.gn.practice;

import java.util.Scanner;

public class Submit06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		char grade = ' ';
		char option = '0';
		
		score= scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 95) {
				option = '+';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 85) {
				option = '+';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 75) {
				option = '+';
			}
		} else if(score >= 60) {
			grade = 'D';
			if(score >= 65) {
				option = '+';
			}	
		} else {
			grade = 'F';
			option = ' ';
		}
		
		System.out.println(grade + "" +option);
		
		scan.close();
	}
}
