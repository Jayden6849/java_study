package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		outer:
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
		
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			inner:
			switch(select) {
			case 1:
				fileSave();
				break inner;
			case 2:
				fileOpen();
				break inner;
			case 3:
				fileEdit();
				break inner;
			case 9:
				System.out.print("프로그램을 종료합니다.");
				sc.close();
				break outer;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue outer;
			}
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		outer:
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			
			System.out.print("내용 : ");
			String input = sc.nextLine();
			
			if("ex끝it".equals(input)) {
				sb.reverse();
				sb.delete(0, 1);
				sb.reverse();
				while(true) {
					System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
					String fileName = sc.nextLine();
					if(fc.checkName(fileName)) {
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
						String overwrite = sc.nextLine();
						if("y".equalsIgnoreCase(overwrite)) {
							fc.fileSave(fileName, sb);
						} else if("n".equalsIgnoreCase(overwrite)) {
							continue;
						}
					} else {
						fc.fileSave(fileName, sb);
					}
					break outer;
				}
			}	
			sb.append(input).append("\n");
		}
	}
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			System.out.print(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String name = sc.nextLine();
		
		if(fc.checkName(name)) {
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				
				System.out.print("내용 : ");
				String input = sc.nextLine();
				
				if("ex끝it".equals(input)) {
					sb.reverse();
					sb.delete(0, 1);
					sb.reverse();
					fc.fileEdit(name, sb);
					break;
				}	
				sb.append(input).append("\n");
			}
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
}
