package com.gn.study;

public class LoopStmt {
	public static void main(String[] args) {
		// 1-10까지 모든 정수를 출력하고 싶을 경우
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
//		System.out.println(i); // int i 가 선언된 scope를 벗어남. 쓰고싶다면 for문 밖에서 선언하면 됌
		
		// 초기식을 밖으로 뺄 수도 있고, 또한 생략까지도 가능하다.
		int i = 1;
		for (; i<=5; i++) {
			System.out.println(i);
		}
		
		// 조건식, 증감식 또한 생략이 가능하다. - 블록 안으로 밀어 넣거나, 무한루프를 만들고자 할 때
		for(;;) {
			System.out.println(i);
			i++;
			
			if(i>100) break;
		}		
	}
}
