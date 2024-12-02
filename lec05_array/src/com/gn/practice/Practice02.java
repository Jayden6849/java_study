package com.gn.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
//		int[] iArr = {-62, 107, -12, 89, -35};
//		
//		for(int num : iArr) {
//			if(num > 50) System.out.println(num);
//		}
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5];
			
		try {
			System.out.print("임의의 정수 5개를 입력해주세요 : ");
			for(int i=0; i<intArr.length; i++) {
				intArr[i] = sc.nextInt();
			}
		} catch (InputMismatchException ime) {
			sc.next();
			System.out.println("주의 :: 정수를 입력해주셔야합니다.");
		}
		
		for(int num : intArr) {
			if(num > 50) System.out.println(num);
		}
		
		sc.close();
	}
}
