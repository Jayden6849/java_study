package com.gn.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		
		while (true) {
			System.out.print("1~10 사이의 정수를 입력해주세요(종료:99) : ");

			try {
				num = sc.nextInt();
			} catch (InputMismatchException ime) {
				sc.nextLine();
				System.out.println("ERROR :: 1~10 사이의 정수를 입력하셔야합니다!!");
				continue;
			}
			
			if(num == 99) break;
			if(num < 1 || 10 < num) {
				System.out.println("ERROR :: 1~10 사이의 정수를 입력하셔야합니다!!");
				continue;
			}
			
			if(num >= 9) {
				System.out.println(num + "은/는 9이상입니다.");
			} else if(num >= 6) {
				System.out.println(num + "은/는 6이상 9미만입니다.");
			} else if(num >= 3) {
				System.out.println(num + "은/는 3이상 9미만입니다.");
			} else {
				System.out.println(num + "은/는 3미만입니다.");
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}
