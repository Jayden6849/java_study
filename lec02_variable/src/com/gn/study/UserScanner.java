package com.gn.study;

import java.util.Scanner; // 1. 외부에서 가져오기

public class UserScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 2. Scanner 객체 생성

		// 정수 형태 입력받기
		System.out.print("점수 : ");
		String input2 = scan.next();
		int num = Integer.parseInt(input2);
		System.out.println("입력한 점수 : " + num + "점");
		
		scan.nextLine();
		
		System.out.print("이름 : ");
		String input = scan.nextLine();	// 3. Scanner 활용		
		System.out.println("입력한 이름 : " + input);
		
		scan.close();
	}
}
