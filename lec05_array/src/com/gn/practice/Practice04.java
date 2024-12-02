package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
//		int[] ages = {20, 18, 22, 19, 21};
//		
//		int max = ages[0];
//		int min = ages[0];
//		
//		for(int i=0; i<ages.length; i++) {
//			if(max < ages[i]) max = ages[i];
//			if(min > ages[i]) min = ages[i];
//		}
//		
//		System.out.println("가장 나이가 많은 학생의 나이 : " + max);
//		System.out.println("가장 어린 학생의 나이 : " + min);
		
		Scanner sc = new Scanner(System.in);
		
		int[] ages = new int[5];
		
		System.out.print("학생들 5명의 나이를 입력해주세요 : ");
		for(int i=0; i<ages.length; i++) {
			ages[i] = sc.nextInt();
		}
		
		int max = ages[0];
		int min = ages[0];
		
		for(int i=0; i<ages.length; i++) {
			if(max < ages[i]) max = ages[i];
			if(min > ages[i]) min = ages[i];
		}
		
		System.out.println("가장 나이가 많은 학생의 나이 : " + max);
		System.out.println("가장 어린 학생의 나이 : " + min);
		
		sc.close();
	}
}
