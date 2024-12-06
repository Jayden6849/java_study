package com.gn.study.controller;

import com.gn.study.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		System.out.println("===========");
		
		Parent p = new Parent(); // 부모의 기본 생성자
		Child c = new Child(); // 부모의 기본 생성자 > 자식의 기본 생성자
		
		// p의 경우 부모의 메소드만 사용 가능함
		System.out.println(p.getA());
		
		// c의 경우 부모의 메소드와 본인의 메소드를 모두 쓸 수 있음
		System.out.println(c.getB());
		System.out.println(c.getA()); 
		
		Parent pc = new Child(); // 부모의 기본 생성자 > 자식의 기본 생성자
		
		// pc의 경우 부모의 메소드만 사용 가능함
		System.out.println(pc.getA());
		
		System.out.println("===========");
		
		Juice j = new Juice("트로피칼", 500, "용과");
		j.juiceInfo();
		
		System.out.println("===========");
		
		Food food = new Food();
		food.printReaction();
		
		Food pizza1 = new Pizza();
		pizza1.printReaction();
		
		Pizza pizza2 = new Pizza();
		pizza2.printReaction();
	}
}
