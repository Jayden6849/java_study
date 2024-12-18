package com.gn.practice11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		// 1. 오늘 날짜 출력
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.of(0, 0, 0, 0);
		LocalDateTime today = LocalDateTime.of(ld, lt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + today.format(dtf));
		
		// 2. 영화 개봉까지 남은 날 출력
		LocalDateTime opening = LocalDateTime.of(2024, 12, 25, 0, 0, 0, 0);
		long diff = ChronoUnit.DAYS.between(today, opening);
		System.out.println("영화 개봉까지 남은 날 : " + diff + "일");
		
		// 3. 영화 개봉일의 요일 출력 -> getKoreanDayOfWeek 메소드 호출
		System.out.print("영화 개봉일의 요일 : ");
		System.out.println(getKoreanDayOfWeek(opening.getDayOfWeek().getValue()));
		
		// 4. 개봉일 출력
		System.out.println("개봉일 : " + opening.format(dtf));
	}
	
	public static String getKoreanDayOfWeek(int day) {
		// 요일의 정보를 숫자 형태로 전달 받음
		// LocalDate의 getDayOfWeek().getValue() 활용
		String result = "";
		switch(day) {
		case 1: result = "월요일"; break;
		case 2: result = "화요일"; break;
		case 3: result = "수요일"; break;
		case 4: result = "목요일"; break;
		case 5: result = "금요일"; break;
		case 6: result = "토요일"; break;
		case 7: result = "일요일"; break;
		}
		
		return result;
  }
}
