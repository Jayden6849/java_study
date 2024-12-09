package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		Product food1 = new Food("치킨", 20000, 3);
		Product book1 = new Book("자바의 정석", 15000);
				
		System.out.print("치킨의 최종 가격 : ");
		System.out.println(food1.calculatePrice());
		
		System.out.print("자바의 정석의 최종 가격 : ");
		System.out.println(book1.calculatePrice());
	}
}
