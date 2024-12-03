package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		int[] scores = {54, 23};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길동이 : ");
		int gildong = sc.nextInt();
		
		int[] scores2 = new int[scores.length+1];
		
		for(int i=0; i<Math.min(scores.length,  scores2.length); i++) {
			scores2[i] = scores[i];
		}
		
		scores2[scores2.length-1] = gildong;
		
		for(int i=0; i<scores2.length; i++) {
			System.out.println(scores2[i]);
		}
		
		int sum = 0;
		for(int i=0; i<scores2.length; i++) {
			sum += scores2[i];
		}
		
		System.out.printf("총합 : %d\n", sum);
		System.out.printf("평균 : %d\n", sum/(scores2.length));
		
		sc.close();
	}
}
