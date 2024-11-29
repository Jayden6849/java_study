package com.gn.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int lumin = -1;
		String ment = "";
		
		try {
		System.out.print("조명의 밝기를 입력하세요 (0~3): ");
		lumin = scan.nextInt();
		} catch (InputMismatchException ime) {
			scan.nextLine();
			System.out.println("0-3 사이의 정수를 입력하셔야 합니다.");
		}
		
		switch(lumin) {
		case 0:
			ment = "조명을 끕니다.";
			break;
		case 1:
			ment = "어두운 조명입니다.";
			break;
		case 2:
			ment = "밝은 조명입니다.";
			break;
		case 3:
			ment = "매우 밝은 조명입니다.";
			break;
		default:
			ment = "Error :: 0-3 사이의 정수를 입력하셔야 합니다.";
		}
		
		System.out.println("현재 조명의 밝기: " + ment);
		
		scan.close();
	}
}
