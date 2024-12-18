package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : " + start.format(dtf1));
		
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
		
			switch(input) {
				case "y": case "Y":
					LocalTime end = LocalTime.now();
					long diff = ChronoUnit.SECONDS.between(start, end);
					System.out.println("경과(초) : " + diff);
					break;
				case "n": case "N":
					System.out.print("종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("다시 입력해주세요.");
					continue;
			}
		}
	}
}
