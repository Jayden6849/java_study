package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;

public class Run {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		File dir1 = new File("C:\\test\\sub");
		File dir2 = new File("C:\\test\\sub\\"+today.getYear()+"\\"+today.getMonthValue()+"\\"+today.getDayOfMonth()+"");
		
		if(!dir1.exists()) {
			if(dir1.mkdirs()) {
				if(dir2.mkdirs()) {
					System.out.println("디렉토리 생성 성공");
				} else {
					System.out.println("디렉토리 생성 실패");
				}
			} else
				System.out.println("디렉토리 생성 실패");
		} else {
			System.out.println("이미 존재하는 디렉토리");
		}
	}
}
