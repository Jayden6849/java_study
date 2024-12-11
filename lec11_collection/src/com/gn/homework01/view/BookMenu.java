package com.gn.homework01.view;

import java.util.List;
import java.util.Scanner;

import com.gn.homework01.controller.BookController;
import com.gn.homework01.model.vo.Book;

/*
 *  view
 *  사용자가 메뉴를 선택할 수 있는 입력창
 *  입력받은 정보를 BookController에게 전달
 */

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		outer:
		while(true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차수 정렬");
			System.out.println("9. 종료");
		
			System.out.print("메뉴 선택 : ");
			int input = sc.nextInt();
			sc.nextLine();
		
			inner:
			switch(input) {
			case 1:
				insertBook();
				break inner;
			case 2:
				selectList();
				break inner;
			case 3:
				searchBook();
				break inner;
			case 4:
				deleteBook();
				break inner;
			case 5:
				ascBook();
				break inner;
			case 9:
				System.out.print("프로그램을 종료합니다.");
				break outer;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue outer;
			}
		}
	}
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명: ");
		String author = sc.nextLine();
		System.out.print("장르 : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		String strCategory = "";
		
		switch(category) {
		case 1:
			strCategory = "인문";
			break;
		case 2:
			strCategory = "자연과학";
			break;
		case 3:
			strCategory = "어린이";
			break;
		default:
			strCategory = "기타";
		}
		
		Book book = new Book(title, author, strCategory, price);
		
		bc.insertBook(book);
	}
	public void selectList() {
		List<Book> bookList = bc.selectList();
		
		System.out.println("=== 전체 조회 ===");
		
		if(bookList.isEmpty())
			System.out.println("존재하는 도서가 없습니다.");
		else {
			for(Book book : bookList) {
				System.out.println(book);
			}
		}
	}
	public void searchBook() {
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		List<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty())
			System.out.println("검색 결과가 없습니다.");
		else {
			for(Book book : searchList) {
				System.out.println(book);
			}
		}
		
	}
	public void deleteBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	public void ascBook() {
		bc.ascBook();
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
			selectList();
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
