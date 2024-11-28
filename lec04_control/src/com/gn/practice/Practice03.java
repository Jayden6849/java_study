package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String gender;
		int length;
		
		System.out.print("성별(F/M) : ");
		gender = sc.next();
		
		if("F".equals(gender) || "f".equals(gender)) {
			System.out.print("머리(cm) : ");
			length = sc.nextInt();
			
			if(0<= length && length <= 7) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
			
		} else if ("M".equals(gender) || "m".equals(gender)) {
			System.out.print("머리(cm) : ");
			length = sc.nextInt();
			
			if(0<= length && length <= 3) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("성별을 정확히 입력해주셔야합니다.(F/M)");
		}
		
		sc.close();
	}
}
