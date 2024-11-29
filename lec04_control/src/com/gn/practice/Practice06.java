package com.gn.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("** 1부터 순차적으로 합계를 구하고 그 합이 n을 초과하면 종료되는 프로그램입니다");
		System.out.print("n을 입력해주세요 : ");
		int limit = -1;
		
		try {
		limit = scan.nextInt();

		int sum = 0;
		
		for(int i=1; ;i++) {
			if(1>limit) {
				System.out.println("n은 1이상의 정수를 입력하셔야합니다");
				break;
			}
			sum += i;
			System.out.println(sum);
			if(sum>limit) break;
		}
		
		System.out.println("초과된 합 : " + sum);
		} catch (InputMismatchException ime) {
			System.out.println("n은 1이상의 정수를 입력해야합니다.");	
		} finally {
			scan.close();
		}
	}
}
