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
	}
}
