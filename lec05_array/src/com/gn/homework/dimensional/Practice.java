package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[] height = {152, 180, 165, 158, 171};
		
		int tmp;
		for(int i=0; i<(height.length-1); i++) {
			for(int j=i+1; j<height.length; j++) {
				if(height[i] > height[j]) {
					tmp = height[i];
					height[i] = height[j];
					height[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<height.length; i++) {
			if(i == (height.length - 1)) 
				System.out.println(height[i]);
			else
				System.out.print(height[i] + ",");
		}
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] iArr = new int[input];
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("총합 : " + sum);
		
		sc.close();
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		int inputNum;
		
		do {
			System.out.print("정수 : ");
			inputNum = sc.nextInt();
			
			if(inputNum < 3 || inputNum%2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				sc.close();
				break;
			}
		} while(true);
		
		for(int i=0; i<((inputNum/2)+1); i++) {
			System.out.print((i+1) + ", ");
		}
		
		for(int i=(inputNum/2)-1; i<inputNum; i--) {
			if(i < 0) break;
			
			if(i == 0)
				System.out.print(i+1);
			else 
				System.out.print(i+1 +", ");
		}
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		
		String[] choices = {"가위", "바위", "보"};
		
		int cnt = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		do {
			System.out.print("가위바위보 : ");
			String input = sc.next();
			
			int random = (int)(Math.random()*3);
			String computer = choices[random];
			
			if("stop".equalsIgnoreCase(input)) {
				System.out.println(cnt + "전 " + win + "승 " + draw + "무 " + lose + "패");
				sc.close();
				break;
			} else if(!("바위".equals(input) || "가위".equals(input) || "보".equals(input))) {
				System.out.println("잘못 입력하셨습니다.\n");
				continue;
			}
			cnt++;
			
			System.out.println("컴퓨터 : " + computer);
			System.out.println("사용자 : " + input);
			if(computer.equals(input)) {
				System.out.println("비겼습니다");
				draw++;
			} else if(("보".equals(computer) && "가위".equals(input)) || ("가위".equals(computer) && "바위".equals(input)) || ("바위".equals(computer) && "가위".equals(input))) {
				System.out.println("이겼습니다 !");
				win++;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
			}
			System.out.println();
		} while(true);
	}
}
