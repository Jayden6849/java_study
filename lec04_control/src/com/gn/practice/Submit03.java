package com.gn.practice;

import java.util.Scanner;

public class Submit03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		char ch = ' ';
		
		if(input != null) {
			ch = input.charAt(0);
		}
		
		if('A' <= ch && ch <= 'Z')
			System.out.println("대문자");
		else if('a' <= ch && ch <= 'z')
			System.out.println("소문자");
		else if('0' <= ch && ch <= '9')
			System.out.println("숫자");
		else
			System.out.println("기타문자");
		
		scan.close();
	}
}
