package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.phone = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		
		p2.phone = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		
		System.out.println(p1.phone);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
		System.out.println(p2.phone);
		System.out.println(p2.height);
		System.out.println(p2.weight);
	}
}
