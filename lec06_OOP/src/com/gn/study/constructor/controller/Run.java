package com.gn.study.constructor.controller;

import com.gn.study.constructor.model.vo.Book;
import com.gn.study.constructor.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getBrand());
		
		Car c2 = new Car("Benz", "white", 2024);
		System.out.println(c2.getBrand());
		
		Book b1 = new Book(100);
		System.out.println(b1.getPrice());
	}
}
