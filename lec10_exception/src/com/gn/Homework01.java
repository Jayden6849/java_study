package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = (int)((Math.random() * 50)+1);
		int input = 0;
		
		while(true) {
			System.out.print("1~50사이의 숫자 : ");
			
			try {
				input = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException ime) {
				sc.nextLine();
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				continue;
			}	
				
			if(!(1 <= input && input <= 50)) {
				System.out.println("정답은 1~50 범위에 있어요!!");
				continue;
			}
			
			if(answer < input) {
				System.out.println("Down!");
			} else if(answer > input) {
				System.out.println("Up!");
			} else {
				System.out.println("축하합니다~ 정답이에요");
				break;
			}
		}
		sc.close();
	}
}
