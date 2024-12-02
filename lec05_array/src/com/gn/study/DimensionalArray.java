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
		
		
		
		
		System.out.println("\n===== 배열 출력 테스트 =====");
		System.out.println("intArr = " + Arrays.toString(intArr));
		System.out.println("StrArr = " + Arrays.toString(strArr));
		System.out.println("heights = " + Arrays.toString(heights));
		System.out.println("age1 = " + Arrays.toString(age1));
		System.out.println("age2 = " + Arrays.toString(age2));
		
	}
}
