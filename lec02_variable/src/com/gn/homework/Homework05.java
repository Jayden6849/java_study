package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = scan.nextDouble();
		System.out.print("영어 : ");
		double eng = scan.nextDouble();
		System.out.print("수학 : ");
		double math = scan.nextDouble();
		
		int total = (int)(kor + eng + math);
		int average = (int)(total/3);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		scan.close();
	}
}
