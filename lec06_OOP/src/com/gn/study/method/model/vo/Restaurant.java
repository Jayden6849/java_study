package com.gn.study.method.model.vo;

public class Restaurant {
	// 1. 매개변수가 없는 경우 :: 인사
	public void welcomeMsg() {
		System.out.println("환영합니다~");
	}
	
	// 2. 기본형 매개변수 :: 테이블 번호를 입력 받아서 출력
	public void setTableNumber(int tableNumber) {
		System.out.println("테이블 번호 " + tableNumber + "번 자리에 앉아주시면 감사하겠습니다");
	}
	
	// 3. 배열 매개변수 :: 주문 목록을 입력받아서 출력
	public void processOrder(String[] menuItems) {
		System.out.println("주문 한 번 확인하겠습니다.");
		for(String item : menuItems) {
			System.out.println(item);
		}
	}
	
	// 4. 클래스 매개변수
	public void sodaSetting(Soda soda) {
		System.out.println(soda.getName() + " 먼저 세팅하겠습니다.");
	}
}
