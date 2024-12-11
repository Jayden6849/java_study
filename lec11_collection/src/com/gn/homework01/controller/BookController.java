package com.gn.homework01.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gn.homework01.model.vo.Book;

/*
 * controller
 * 도서 정보를 담고 있는 ArrayList를 가짐
 * BookMenu에서 입력받은 정보를 가지고 ArrayList에 접근함
 */

public class BookController {
	private List<Book> bookList = new ArrayList<>();
	
	public BookController() {
		super();
		bookList.add(new Book("느리게 나이드는 습관", "정희원", "인문", 16200));
		bookList.add(new Book("코스모스", "칼 세이건", "자연과학", 17910));
		bookList.add(new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610));
		bookList.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public List<Book> selectList() {
		return bookList;
	}
	public List<Book> searchBook(String keyword) {
		List<Book> searchList = new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			if((bookList.get(i).getTitle()).contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				removeBook = bookList.get(i);
				bookList.remove(i);
			}
		}
		
		return removeBook;
	}
	public int ascBook() {
		Collections.sort(bookList);
		return 1;
	}
}