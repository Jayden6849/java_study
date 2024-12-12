package com.gn.homework02.view;

import java.util.Iterator;
import java.util.Scanner;

import com.gn.homework02.controller.LotteryController;
import com.gn.homework02.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		outer:
		while(true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			inner:
			switch(select) {
			case 1:
				insertObject();
				break inner;
			case 2:
				deleteObject();
				break inner;
			case 3:
				searchObject();
				break inner;
			case 4:
				winObject();
				break inner;
			case 5:
				sortedWinObject();
				break inner;
			case 6:
				searchWinner();
				break inner;
			case 9:
				System.out.print("프로그램 종료.");
				break outer;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue outer;
			}
		}
	}
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		int cnt=0;
		while(cnt<count) {
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.next();
			sc.nextLine();
			
			boolean insert = lc.insertObject(new Lottery(name, phone));
			if(insert == false) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				continue;
			}
			cnt++;
		}
		
		System.out.println(count + "명 추가 완료했습니다.");
	}
	public void deleteObject() {
		System.out.println("===== 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 :");
		String name = sc.next();
		sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		sc.nextLine();
		
		Lottery deleteLottery = new Lottery(name, phone);
		boolean delete = lc.deleteObject(deleteLottery);
		if(delete == true)
			System.out.println("삭제 완료되었습니다.");
		else
			System.out.println("존재하지 않는 대상입니다.");
	}
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		if(lc.winObject() == null) {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		} else {
			System.out.println(lc.winObject());
		}
	}
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		
		Iterator<Lottery> iter = lc.sortedWinObject().iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		sc.nextLine();
		
		if(lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("다음 기회에!");
		}
	}
}
