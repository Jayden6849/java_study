package com.gn.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		System.out.println("암호 : " + name.substring(0, 1) + birth.substring(2, 4) + birth.substring(6) + name.substring(1));
		
		sc.close();
	}
}
