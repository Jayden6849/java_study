package com.gn.study;

public class Test {
	// Main Method = 프로젝트 내 최소 1개는 존재해야함. OS가 자동으로 호출
//	라인 주석 입니다. ctrl + /
	public static void main(String[] args) {
		System.out.println("Hello World");
	/*
	 * 불록 주석입니다.
	 * 여러 줄 주석입니다.
	 * ctrl + shift + /
	 */
		// 1. print -> 줄바꾸기 x
		System.out.print("Hello World");
		System.out.print(123);
		System.out.print("\n");
		
		// 2. println -> 줄바꾸기 o
		System.out.println("Hello World");
		System.out.println(123);
	
		// 3. printf(포현식, 데이터);
		System.out.printf("Hello world!!%d\n", 123);
		double a = 2.0;
		double b = 3.1;
		System.out.printf("%.1f+%.1f=%.1f\n", a, b, a+b);
		System.out.printf("%s\n", "Hello World");
		// 이룸 : 김철수, 나이 : 25, 키 : 179.8cm
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1fcm\n", "김철수", 25, 179.83);
		
		// Escape Sequence \n \\ \" \'
		System.out.println("He said \"Hi\"");
		
		System.out.print("\"언녕하세요.\"\n");
		
		System.out.println("Hello \nWorld");
	}
}
