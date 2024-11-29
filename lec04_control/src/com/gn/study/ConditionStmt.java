package com.gn.study;

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
		
		// 중첩 if문
		// 변수의 값이 양수인지 음수인지 판단을 한 후 양수라면 짝수인지 홀수인지 판단하는 메커니즘
		int target = -5;
		
		if (target > 0) {
			if (target%2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else if (target < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}

		// switch문
		int day = 2; // 관례상 0(일요일) - 6(토요일) :: flag - 많이 쓰이는 특정한 약속들
		String text = "";
		
		switch(day) {
		case 0:
			text = "일";
			break;
		case 1:
			text = "월";
			break;
		case 2:
			text = "화";
			break;
		case 3:
			text = "수";
			break;
		case 4:
			text = "목";
			break;
		case 5:
			text = "금";
			break;
		case 6:
			text = "토";
			break;
		default:
			text = "Error(-1)";
		}		
		
		if(0<=day && day<=6) {
			System.out.println("오늘은 " + text + "요일입니다.");
		} else {
			System.out.println("올바르게 입력되지 않았습니다.");
		}
		
		sc.close();
	}
}
