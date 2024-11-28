package com.gn.practice;

import java.util.Scanner;

public class Submit07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		
		if(input1 >= input2) System.out.println(true);
		else System.out.println(false);
		
		scan.close();
	}
}
