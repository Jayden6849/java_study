package com.gn.exercise;

import java.util.Arrays;

public class Exercise02 {
	public static void main(String[] args) {
		int[] arr = {10, 50, 42, 38, -2, 5};
		
		// 버블정렬 (오름차순)
		int tmp;
		for(int i=0; i<(arr.length-1); i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("오름차순 : " + Arrays.toString(arr));
		
		// 버블정렬 (내림차순)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("내림차순 : " + Arrays.toString(arr));
	}
}
