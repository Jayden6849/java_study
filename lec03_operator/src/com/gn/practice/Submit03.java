package com.gn.practice;

import java.util.Scanner;

public class Submit03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int z = ++x + y++; 
		
		System.out.println(z);
		
		scan.close();
	}
}
