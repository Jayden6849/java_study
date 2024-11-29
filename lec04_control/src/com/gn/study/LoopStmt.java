package com.gn.study;

public class LoopStmt {
	public static void main(String[] args) {
		// 1-10까지 모든 정수를 출력하고 싶을 경우
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
//		System.out.println(i); // int i 가 선언된 scope를 벗어남. 쓰고싶다면 for문 밖에서 선언하면 됌
		
		// 초기식을 밖으로 뺄 수도 있고, 또한 생략까지도 가능하다.
		int tmp = 1;
		for (; tmp<=5; tmp++) {
			System.out.println(tmp);
		}
		
		// 조건식, 증감식 또한 생략이 가능하다. - 블록 안으로 밀어 넣거나, 무한루프를 만들고자 할 때
		for(;;) {
			System.out.println(tmp);
			tmp++;
			
			if(tmp>100) break;
		}		
		
		// 중첩 for
		// int a 는 1-2까지 하나씩 커지면서 반복
		// int b 는 1-3까지 하나직 커지면서 반복
		for (int a=1; a<=2; a++) {
			System.out.println("A"+a);
			for(int b=1; b<=3; b++) {
				System.out.println("B"+b);
			}
			System.out.println("C");
		}
		
		// Nested For 활용
		for(int x=0; x<2; x++) {
			for(int y=0; y<4; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		// break를 사용한 중첩 for문
		// 외부 : 0에서부터 2미만 1씩 커지면서 // 내부 : 0에서부터 3미만 1씩 커지면서 반복
		System.out.print(0);
		for(int i=0; i<2; i++) {
			System.out.print("1");
			for(int j=0; j<3; j++) {
				if(j>1) break;
				System.out.print(2);
			}
			System.out.print(3);
		}
		System.out.print(4);
		System.out.println();
		
		// while문
		int count = 1;
//		while(count <= 10) {
//			System.out.println(count);
//			count++;
//		}
		while(true) {
			System.out.println(count);
			count++;
			if(count > 10) break;
		}
	}
}