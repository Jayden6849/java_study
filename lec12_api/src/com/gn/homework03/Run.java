package com.gn.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		email.trim();
		
		if(email.endsWith("@goodee.co.kr")) {
			System.out.println(email.substring(0, email.lastIndexOf("@")).toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
		
		sc.close();
	}
}
