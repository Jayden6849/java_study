package com.gn.practice;

import java.util.Scanner;

public class Submit01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		System.out.println("500원:" + money/500 + "개");
		System.out.println("100원:" + (money%500)/100 + "개");
		System.out.println("50원:" + ((money%500)%100)/50 + "개");
		System.out.println("10원:" + (((money%500)%100)%50)/10 + "개");
		System.out.println("1원:" + (((money%500)%100)%50)%10 + "개");
		
		scan.close();
	}
}
