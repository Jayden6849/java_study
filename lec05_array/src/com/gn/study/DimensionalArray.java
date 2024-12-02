package com.gn.study;

import java.util.Arrays;

public class DimensionalArray {
	public static void main(String[] args) {
		int[] scores = {85, 90, 78, 92, 88};
		
		System.out.println(scores);
		System.out.println(Arrays.toString(scores));
		
		// 1. 배열의 선언
		int[] intArr;
		
		// 2. 배열의 생성
		intArr = new int[5];
		
		// 2-1. 배열의 선언과 선언을 동시에
		int[] heights = new int[5];
		String[] strArr = {"가", "나", "다", ""};
		
		// 3. 배열의 초기화(인덱스를 활용)
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
		}
		heights[0] = 162;
		heights[1] = 168;
		heights[2] = 173;
		heights[3] = 178;
		
		System.out.println(heights[3]); // 178
		
		// 4. 배열의 초기화(default)
		// heights[4] 에는 int 기본값인 0, strArr[4] 에는 String 기본값인 null 지정된다.

		// 5. 배열의 초기화
		// 변수에 직접 접근
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;
		
		// for 문을 활용 :: 규칙이 존재할 때 사용할 수 있음.
		int[] age2 = new int[3];
		for(int i=0; i<age2.length; i++) {
			age2[i] = i+10;
		}
		
		// 가능
		int[] age3 = new int[] {1, 2, 3, 4};
		int[] age4 = {5, 6, 7};
		
		// 불가능 :: 주의 - 배열이 데이터를 저장하는 과정떄문에 불가능함 - 이 경우 배열의 생성 절차가 생략되어 문제가 발생함
//		int[] element;
//		element = {9, 10, 11};
		
		// 6. 배열의 저장과정
		int[] score; // 선언 :: Stack 에 배열 score 주소값이 생성됨 = score 라는 저장공간이 마련
		score = new int[4]; // 생성 :: Heap 에 객체를 마련함
		score[0] = 90; // 초기화 :: Heap 에 생성된 배열의 원하는 인덱스에 원하는 값을 대입함
		
		System.out.println("\n===== 배열 출력 테스트 =====");
		System.out.println("intArr = " + Arrays.toString(intArr));
		System.out.println("StrArr = " + Arrays.toString(strArr));
		System.out.println("heights = " + Arrays.toString(heights));
		System.out.println("age1 = " + Arrays.toString(age1));
		System.out.println("age2 = " + Arrays.toString(age2));
		
		System.out.println("age3 = " + Arrays.toString(age3));
		System.out.println("age4 = " + Arrays.toString(age4));
		System.out.println("score = " + Arrays.toString(score));
		
	}
}
