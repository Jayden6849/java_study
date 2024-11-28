package com.gn.study;

public class TriOperator {
	public static void main(String[] args) {
		// 삼항연산자
		int x = 5;
		int y = 10;
		
		// x, y 중 더 큰 값을 반환받고 싶을 때
		int max = (x > y) ? x : y; // 같을 때도 문제가 없을 것으로 예상.
		System.out.println("최대값 : " + max);
		
		// x, y 중 더 작은 값을 반환받고 싶을 때
		int min = (x < y) ? x : y;
		System.out.println("최소값 : " + min);
		
		// 중첩 삼항 연산자 - 예시 :: 3개의 정수 중에서 가장 큰 수 찾기 
		int z = 3;
		
		int big = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println("x, y, z 중 가장 큰 값 : " + big);
		
		int small = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
		System.out.println("x, y, z 중 가장 작은 값 : " + small);
	}
}
