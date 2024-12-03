package com.gn.study.basic.controller;

import com.gn.study.basic.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		// 1. 참조변수의 선언 후 인스턴스 생성하고 참조변수에 연결함
		Car c1 = new Car();
		/*
		 * 1. Stack 에 Car 타입만 담을 수 있는 c1이라는 주소값이 생성됨
		 * 2. Heap 에 Car 객체가 인스턴스화
		 * 3. 참조변수 c1 에 생성된 객체 Car 가 연결됨
		 */
		
		System.out.println(c1.toString());
		
		// 클래스 명은 같지만 다른 패키지에 있는걸 동시에 쓰고싶다면 이런식으로 주소값을 전부 다 써줘야함.
		com.gn.study.field.model.vo.Car c2 = new com.gn.study.field.model.vo.Car();
		
		
		System.out.print(c2.toString());
	}
}
