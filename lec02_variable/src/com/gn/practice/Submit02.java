package com.gn.practice;

import java.util.Scanner;

/** long 타입을 입력받아 변수 number에 저장 후 number 변수의 값을
	 *
	 *int 형으로 변환한 결과를 출력하시오.
	*/
public class Submit02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long number = scan.nextLong();
		System.out.println((int)number);
		
		scan.close();
	}
}
