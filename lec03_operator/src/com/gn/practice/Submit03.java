package com.gn.practice;

import java.util.Scanner;

public class Submit03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pieces = sc.nextInt();
		int boxes;
		
		boxes = (pieces%10 != 0) ? (pieces/10 + 1) : pieces/10;
		
		System.out.println(boxes);
		
		sc.close();
	}
}
