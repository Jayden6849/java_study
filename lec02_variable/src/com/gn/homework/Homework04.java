package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String input = scan.next();
		
		char ch = input.charAt(0);
		
		System.out.println(ch + "의 유니코드 : " + (ch+0));
		
		scan.close();
	}
}
