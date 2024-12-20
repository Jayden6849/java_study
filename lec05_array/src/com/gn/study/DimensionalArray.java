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
		
		// 7. 배열의 출력
		// (1) 인덱스를 이용한 출력
		System.out.println("\n===== 인덱스를 이용한 출력 =====");
		System.out.println("age1[1] = " + age1[1]);
		
		// (2) 반복문을 이용한 출력 :: 배열이다? 인덱스를 기준으로 규칙을 지니게 됨
		String[] fruits = {"딸기", "체리", "포도"};
		
		for(int i=0; i<fruits.length; i++) {
			System.out.println("fruits[" + i + "] = " + fruits[i]);
		}
		
		// 8. toCharArray()
		String text = "Hello world";
		char[] chArr = text.toCharArray();
		
		for(int i=0; i<chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		
		for (char c : chArr) {
			System.out.print(c);
		}
		System.out.println();
		
		// toCharArray() vs charAt()
		text = "안녕하세요";	
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	
		// for each :: enhanced for :: 향상된 for 문
		int[] numbers = {1,2,3,4,5};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		for(int nums : numbers) {
			System.out.println(nums);
		}
		
		System.out.println("\n===== 배열 출력 테스트 =====");
		System.out.println("intArr = " + Arrays.toString(intArr));
		System.out.println("StrArr = " + Arrays.toString(strArr));
		System.out.println("heights = " + Arrays.toString(heights));
		System.out.println("age1 = " + Arrays.toString(age1));
		System.out.println("age2 = " + Arrays.toString(age2));
		
		System.out.println("age3 = " + Arrays.toString(age3));
		System.out.println("age4 = " + Arrays.toString(age4));
		System.out.println("score = " + Arrays.toString(score));
		
		// 배열의 활용 :: 총합과 평균 구하기
		
		int[] nums = {83, 90, 100, 100, 50};
		
		int sum = 0;
		double average = 0.0;
		
		for(int i : nums) {
			sum += i;
		}
		
		average = sum/(double)(nums.length);
		
		System.out.printf("합계 = %d점\n", sum);
		System.out.printf("평균 = %.1f점\n", average);
		
		// 배열의 활용 :: 최대값과 최소값
		int[] iArr = {8, 9, 10, 4, 2};
		
		int max = iArr[0];
		int min = iArr[0];
		
		for(int i=0; i<iArr.length; i++) {
			if(max < iArr[i]) max = iArr[i];
			if(min > iArr[i]) min = iArr[i];
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		// 배열의 활용 :: 정렬하기 - 오름차순, 내림차순
		int[] data = {8, 4, 1, 3};
		
		// 버블정렬 (Bubble Sort)
		// 0번과 1번 비교 -> 4 8 1 3
		// 0번과 2번 비교 -> 1 8 4 3
		// 0번과 3번 비교 -> 1 8 4 3
		// 1번과 2번 비교 -> 1 4 8 3
		// 1번과 3번 비교 -> 1 3 8 4
		// 2번과 3번 비교 -> 1 3 4 8
		
		int tmp;
		for(int i=0; i<(data.length-1); i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
//				System.out.println(i+" : "+j);
			}
		}
		System.out.println(Arrays.toString(data));
		
		for(int i=0; i<(data.length-1); i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i] < data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
		
		// 배열의 복사
		System.out.println("==== 배열의 복사 ====");
		// 1) 얕은 복사
		int[] arr1 = {5, 6, 7, 8};
		int[] arr2 = arr1;
		arr2[3] = 1000;	// Heap 에 있는 데이터를 바꿔버리면 가리키고 있는 모든 주소값의 내용이 바뀌어버림 :: 거의 쓸 일이 없음
		
		for(int element : arr1) {
			System.out.print(element + ", ");
		}
		System.out.println();
		
		for(int element: arr2) {
			System.out.print(element + ", ");
		}
		System.out.println();
		
		// 2) 깊은 복사
		int[] arr3 = {9, 10, 11, 12};
		int[] arr4 = new int[arr3.length+4]; // 원하는 길이를 지닌 새로운 배열을 만듦
		
		for(int i=0; i<Math.min(arr3.length, arr4.length); i++) {
			arr4[i] = arr3[i];
		}
		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i] + ", ");
		}
		System.out.println();
		
		// Math.random()
		double basic = Math.random();
		System.out.println(basic);
		
		System.out.println((int)(basic*100+1)); // 1~100 사이의 난수
		
		// 예시 10~20 사이의 정수
		int rnd = (int)(Math.random()*11+10);
		System.out.println(rnd);
		
		// 예시 1~45 사이의 정수
		int rnd2 = (int)(Math.random()*45+1);
		System.out.println(rnd2);
	}
}
