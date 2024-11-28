package com.gn.study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionStmt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 10;
		
		if (number > 5) {
			int su = 2;
			System.out.println(number + "은/는 5보다 큽니다.");
			System.out.println("su = " + su);
		}
		// System.out.println(su); // error :: lv의 scope를 벗어났음.
		
		// else
		int num = -3;
		
		if (num >0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
		// else if
 		System.out.print("1~10의 정수 중 하나를 입력해주세요 : ");
		int no = sc.nextInt();
				
		System.out.print("입력하신 수 " + no + "은(는) ");
				
		if (no >= 9) {
			System.out.print("9 이상");
		} else if (no >= 6) {
			System.out.print("6 이상 9 미만");
		} else if (no >= 3) {
			System.out.print("3 이상 6 미만");
		} else {
			System.out.print("3 미만");
		}
				
		System.out.println("입니다.");		
		
		sc.close();
	}
}
