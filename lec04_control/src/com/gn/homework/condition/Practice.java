package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		int fee = 0;
		if(age < 3) {
			fee = 0;
		} else if(age <= 12) {
			fee = 10000;
		} else if(age <= 18) {
			fee = 20000;
		} else if(age <= 64) {
			fee = 30000;
		} else if(age >= 65) {
			fee = 0;
		}
		
		System.out.println("당신의 놀이동산 요금은 " + fee + "원입니다.");
		
		sc.close();
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 일기예보 ===");
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		double temp = sc.nextDouble();
		
		switch(month) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			if(temp >= 35)
				System.out.println("여름 폭염 경보");
			else if(temp >= 33)
				System.out.println("여름 폭염 주의보");
			else
				System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		case 12, 1, 2:
			if(temp <= -15)
				System.out.println("겨울 폭염 경보");
			else if(temp <= -12)
				System.out.println("겨울 폭염 주의보");
			else
				System.out.println("겨울");
			break;
		default:
			System.out.println("해당하는 계절이 없습니다.");
		}
		sc.close();
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int min = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
		
		sc.close();
	}
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 철수네 공장 ===");
		System.out.print("수집된 코드 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 400:
			System.out.println("잘못된 요청입니다.");
			break;
		case 404: 
			System.out.println("요청하신 서비스를 찾을 수 없습니다.");
			break;
		case 500:
			System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
			break;
		case 503:
			System.out.println("일시적인 서버 오류가 발생하였습니다.");
			break;
		default:
			System.out.println("알 수 없는 오류가 발생하였습니다.");
		}
		
		sc.close();
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("스쿼트 운동 시간입니다.");
			break;
		case 2:
			System.out.println("데드리프트 운동 시간입니다.");
			break;
		case 3:
			System.out.println("벤치 프레스 운동 시간입니다.");
			break;
		case 4:
			System.out.println("풀업 운동 시간입니다.");
			break;
		case 5:
			System.out.println("오늘도 수고하셨습니다.");
			break;
		default:
			if(input <= 0) System.out.println("양수만 입력해주세요.");
			else if(input > 5) System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 합격인가? 불합격인가? ===");
		
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int design = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int dev = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int data = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int lang = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int system = sc.nextInt();
		
		double average = (design + dev + data + lang + system)/5.0;
		
		if(design >= 40 && dev >= 40 && data >= 40 && lang >= 40 && system >= 40 && average >= 60) {
			System.out.println("합격을 축하합니다!");
		} else if (average < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else if (design < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (dev < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (data < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (lang < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (system < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		}
		
		sc.close();
	}
}
