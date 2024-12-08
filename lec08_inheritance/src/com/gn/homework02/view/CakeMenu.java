package com.gn.homework02.view;

import java.util.Scanner;

import com.gn.homework02.controller.*;

public class CakeMenu {
	Scanner sc = new Scanner(System.in);
	
	ChocolateController cc = new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int menuNumber = sc.nextInt();
			sc.nextLine();
			
			if(menuNumber == 1) {
				chocolateMenu();
			} else if(menuNumber == 2) {
				greenTeaMenu();		
			} else if(menuNumber == 9) {
				System.out.println("종료합니다");
				sc.close();
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
				continue;
			}
		}
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		sc.nextLine();
		
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		sc.nextLine();
		
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		sc.nextLine();
		
		System.out.println(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
	}
}
