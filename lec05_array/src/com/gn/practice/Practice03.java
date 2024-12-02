package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
		int[] attend = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		
		int sum = 0;
		for(int i : attend) {
			sum += i;
		}
		
		System.out.print("출석한 학생 수 : " + sum + "\n");
		System.out.print("결석한 학생 수 : " + (attend.length-sum) + "\n");
	}
}
