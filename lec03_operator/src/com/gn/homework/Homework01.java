package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		String output = "";
		
		output = input.equals("간다") ? "온다" : "입력오류";
		output = "온다".equals(input) ? "간다" : "입력오류";

		
		System.out.println(output);
		
		sc.close();
	}
}
