package com.gn.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Submit02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int natNum = 0;
		
		try {
			natNum = scan.nextInt();
		} catch (InputMismatchException ime) {
			scan.nextLine();
			System.out.println("자연수를 입력해주셔야합니다.");
		}
		
		if(1 > natNum) {
			System.out.println("올바른 수를 입력해주세요 (자연수는 1이상의 정수입니다)");
		}
		
		else if(natNum%2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		scan.close();
	}
}
