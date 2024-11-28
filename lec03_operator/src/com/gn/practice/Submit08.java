package com.gn.practice;

import java.util.Scanner;

public class Submit08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score < 0 || 100 < score) System.out.println("점수입력오류");
		
		else if(score >= 60) System.out.println("합격");
		else System.out.println("불합격");
		
		scan.close();
	}
}
