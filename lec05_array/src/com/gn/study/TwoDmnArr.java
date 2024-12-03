package com.gn.study;

import java.util.Arrays;

public class TwoDmnArr {
	public static void main(String[] args) {
		// 1. 2차원 배열의 선언
		int[][] arr;

		
		// 2. 2차원 배열의 생성
		arr = new int[2][3];
	
		// 2-1. 동시에
		String[][] strArr = new String[2][2];
		System.out.println(Arrays.deepToString(strArr));
				
		// 3. 2차원 배열의 초기화
		// 1) 인덱스를 이용한 초기화
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(Arrays.deepToString(arr));
		
		// 2) 반복문을 이용한 초기화 :: 규칙이 있을 때 사용해야함
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 3. 선언, 생성, 초기화를 동시에
		int[][] iArr = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] iArr2 = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		
		System.out.println(Arrays.deepToString(iArr));
		System.out.println(Arrays.deepToString(iArr2));
		
		// 4. 출력
		System.out.println("=== 2차원 배열의 출력 ===");
		strArr[0][0] = "딸기";
		strArr[0][1] = "사과";
		strArr[1][0] = "키위";
		strArr[1][1] = "당근";
		
		System.out.println("=== index 활용 ===");
		System.out.println(strArr[0][1]);
		
		System.out.println("=== for 활용 ===");
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
