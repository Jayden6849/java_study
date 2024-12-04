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
	
	public void practice04() {
		int[] num = new int[45];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		int tmp;
		
		for(int i=0; i<num.length; i++) {
			int rnd = (int)((Math.random()*45)); // 0~44를 추출해서 바꾸자
			
			tmp = num[i];
			num[i] = num[rnd];
			num[rnd] = tmp;
		}

		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = num[i];
		}
		
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			if(i == lotto.length-1) {
				System.out.print(lotto[i]);
			} else {
				System.out.print(lotto[i] + " ");
			}
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
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();

		int cnt = 0;
		String[] tmp = {};
		
		exter:
		while(true) {
			String[] strArr = new String[length];
			for(int i=0; i<tmp.length; i++) {
				strArr[i] = tmp[i];
			}
			
			for(int i=cnt; i<strArr.length; i++) {
				System.out.print(cnt++ + 1 + "번째 문자열 : ");
				strArr[i] = sc.next();
				sc.nextLine();
			}
			
			inner:
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				String answer = sc.nextLine();

				if(!("Y".equalsIgnoreCase(answer) || "N".equalsIgnoreCase(answer))) {
					System.out.println("입력할 수 없는 값입니다");
					continue inner;
				} else if("Y".equalsIgnoreCase(answer)) {
					System.out.print("더 입력하고 싶은 개수 : ");
					length += sc.nextInt();
					
					tmp = new String[length];
					for(int i=0; i<strArr.length; i++) {
						tmp[i] = strArr[i];
					}
					
					break inner;
				} else if("N".equalsIgnoreCase(answer)) {
					for(int i=0; i<strArr.length; i++) {
						System.out.println(strArr[i]);
					}
					sc.close();
					break exter;
				}
			}
		}
	}
	
	public void practice07() {
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] copy = new String[report.length];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = report[i];
		}
		copy[0] = "Team Feedback";
		
		System.out.print("원본 보고서: ");
		for(int i=0; i<report.length; i++) {
			if(i==report.length-1) System.out.println(report[i]);
			else System.out.print(report[i] + ", ");
		}
		
		System.out.print("복사된 보고서: ");
		for(int i=0; i<copy.length; i++) {
			if(i==copy.length-1) System.out.println(copy[i]);
			else System.out.print(copy[i] + ", ");
		}
	}
	
	public void practice08() {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		
		System.out.print("어제 메뉴판: ");
		for(int i=0; i<menu.length; i++) {
			if(i==menu.length-1) System.out.println(menu[i]);
			else System.out.print(menu[i] + ", ");
		}
		
		String[] add = {"Salad","Soup"};
		
		String[] today = new String[menu.length + add.length];
		
		for(int i=0; i<today.length; i++) {
			if(i<menu.length)
				today[i] = menu[i];
			else
				today[i] = add[i-menu.length];
		}
		
		System.out.print("오늘 메뉴판: ");
		for(int i=0; i<today.length; i++) {
			if(i==today.length-1) System.out.println(today[i]);
			else System.out.print(today[i] + ", ");
		}
	}
}
