package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		
		String input = sc.next();
		
		String go = "간다";
		String come = "온다";
		
		if(go.equals(input)) {
			System.out.println("앵무새 : " + come);
		} else if(come.equals(input)) {
			System.out.println("앵무새 : " + go);
		}
		
		sc.close();
	}
}
