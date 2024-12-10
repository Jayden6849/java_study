package com.gn.homework04.view;

import java.util.Scanner;

import com.gn.homework04.controller.NumberController;
import com.gn.homework04.exception.NumRangeException;

public class NumberMenu {
	@SuppressWarnings("resource")
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		boolean checkDouble = false;
		
		NumberController nc = new NumberController();
		try {
			checkDouble = nc.checkDouble(a, b);
		} catch(NumRangeException nre) {
			nre.printStackTrace();
			return;
		}
		
		System.out.println(a + "은(는) " + b + "의 배수인가? " + checkDouble);
		
		sc.close();
	}
}
