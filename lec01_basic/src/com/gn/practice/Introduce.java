package com.gn.practice;

public class Introduce {
	public static void main(String[] args) {
		// 1. System.out.print() 만 사용
		System.out.print("안녕하세요~\n");
		System.out.print("저는 \"김철수\"입니다.\n");
		System.out.print("나이는 20살이고, mbti는 istp입니다.\n");
		
		// 2. System.out.println() 만 사용
		System.out.println("안녕하세요~");
		System.out.println("저는 \"김철수\"입니다.");
		System.out.println("나이는 20살이고, mbti는 istp입니다.");
		
		// 3. System.out.printf() 만 사용
		System.out.printf("안녕하세요~\n");
		System.out.printf("저는 \"%s\"입니다.\n", "김철수");
		System.out.printf("나이는 %d살이고, mbti는 %s입니다.\n", 20, "istp");
		
	}
}
