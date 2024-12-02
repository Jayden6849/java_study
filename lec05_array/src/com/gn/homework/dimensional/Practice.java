package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[] height = {152, 180, 165, 158, 171};
		
		int tmp;
		for(int i=0; i<(height.length-1); i++) {
			for(int j=i+1; j<height.length; j++) {
				if(height[i] > height[j]) {
					tmp = height[i];
					height[i] = height[j];
					height[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<height.length; i++) {
			if(i == (height.length - 1)) 
				System.out.println(height[i]);
			else
				System.out.print(height[i] + ",");
		}
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] iArr = new int[input];
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("총합 : " + sum);
		
		sc.close();
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		int inputNum;
		
		do {
			System.out.print("정수 : ");
			inputNum = sc.nextInt();
			
			if(inputNum < 3 || inputNum%2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				sc.close();
				break;
			}
		} while(true);
		
		for(int i=0; i<((inputNum/2)+1); i++) {
			System.out.print((i+1) + ", ");
		}
		
		for(int i=(inputNum/2)-1; i<inputNum; i--) {
			if(i < 0) break;
			
			if(i == 0)
				System.out.print(i+1);
			else 
				System.out.print(i+1 +", ");
		}
	}
}
