package com.gn.study.constructor.controller;

import com.gn.study.constructor.model.vo.Book;
import com.gn.study.constructor.model.vo.Cake;
import com.gn.study.constructor.model.vo.Car;
import com.gn.study.constructor.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getBrand());
		
		Car c2 = new Car("Benz", "white", 2024);
		System.out.println(c2.getBrand());
		
		Book b1 = new Book(100);
		System.out.println(b1.getPrice());
		
		String[] students = {"김철수", "이영희", "홍길동"};
		for(int i=0; i<students.length; i++) {
			Student s = new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
			s.printInfo(students[i], i);
		}
		
		System.out.println("=== CAKE ===");
		Cake cake = new Cake();
		System.out.println(cake.getFlavor());
		System.out.println(cake.getPrice());
	}
}
