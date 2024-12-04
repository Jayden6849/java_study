package com.gn.study.method.model.vo;

public class Library {
	// 1. 책 빌리기 :: 몇 개 빌릴지 모르니 가변인자 활용
	public void borrowBooks(String...books) {
		System.out.println("=== 대출할 책 목록===");
		for(String book : books) {
			System.out.println("- " + book);
		}
	}
	
	// 2. 책 반납하기 :: 연체료 정보와 반납할 책 목록
	public void returnBooks(int lateFee, String...books) {
		System.out.println("총 연체료 : " + lateFee + "원");
		
		for(String book : books) {
			System.out.println("- " + book);
		}
	}
}
