package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100+1);
		
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");
		
		int cnt = 0;
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int input = sc.nextInt();
			sc.nextLine();
			cnt++;
			
			if(answer > input)
				System.out.println("UP !");
			else if(answer < input)
				System.out.println("DOWN !");
			else {
				System.out.println("정답입니다 !!");
				System.out.println(cnt+"회만에 맞추셨습니다.");
				break;
			}
		}
		sc.close();
	}
}
