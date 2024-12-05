package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.infomation();
		
		Book b2 = new Book("홍길동전", 5000, "허균");
		b2.infomation();
		
		Book b3 = new Book("채소 과일 레시피", "터치아트", "박경희", 19300, 0.1);
		b3.infomation();
	}
}
