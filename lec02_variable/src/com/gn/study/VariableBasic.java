package com.gn.study;

public class VariableBasic {
	public static void main(String[] args) {
		// 1. 변수 선언
		int number;
		
		// 2. 변수의 초기화(initiate)
		number = 123;

		// 3. 선언과 초기화를 동시에
		int age = 10;
//		int age = 40; // 선언은 1번만 가능함
		int age2 = 12;
		
		// 4. 변수를 표준출력 해보기
		System.out.println(number);
		System.out.println(age);
		System.out.println(age2);
		
		// 5. 재할당(reallocate)
		int score = 90;
		System.out.println("1 : " + score);
		score = 95;
		System.out.println("2 : " + score);
		
	}
}
