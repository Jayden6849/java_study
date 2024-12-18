package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateRun {
	public static void main(String[] args) {
		// 1. LocalDate
		// (1) 현재 날짜 구하기
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// (2) 특정 날짜 설정
		LocalDate ld2 = LocalDate.of(2024, 12, 25);
		System.out.println(ld2);
		
		// (3) 필드 조회
		System.out.println(ld2.getYear());
		System.out.println(ld2.getMonthValue());
		System.out.println(ld2.getMonth());
		System.out.println(ld2.getDayOfMonth());
		System.out.println(ld2.getDayOfWeek());
		System.out.println(ld2.getDayOfWeek().getValue());
		System.out.println(ld2.getDayOfYear());
		
		// (4) 필드 증감
		LocalDate ld3 = ld.plusWeeks(1);
		System.out.println(ld3);
		
		LocalDate ld4 = ld.minusDays(3);
		System.out.println(ld4);
		
		// 2. LocalTime
		// (1) 현재 시간
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		// (2) 특정 시간
		LocalTime lt2 = LocalTime.of(12, 50, 5);
		System.out.println(lt2);
		
		// (3) 필드 조회
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
		// (4) 필드 증감
		LocalTime lt3 = lt.plusHours(7);
		System.out.println(lt3);
		
		LocalTime lt4 = lt.minusMinutes(20);
		System.out.println(lt4);
		
		// 3. LocalDateTime
		// (1) 현재 날짜와 시간
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		// (2) 특정 날짜와 시간
		LocalDateTime ldt2 = LocalDateTime.of(2025, 1, 1, 6, 30, 45);
		System.out.println(ldt2);
		
		// 4. DateTimeFormatter
		// (1) 날짜와 시간 -> 문자열
		LocalDateTime ldt3 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(ldt3.format(dtf));
		
		// (2) 문자열 -> 날짜와 시간
		String str = "2024-12-25(수) 오후 13:50:26";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd(E) a HH:mm:ss");
		LocalDateTime ldt4 = LocalDateTime.parse(str, dtf2);
		System.out.println(ldt4);
		
		// 5. ChronoUnit
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate endDate = LocalDate.of(2024, 12, 31);
		
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(daysBetween);
	}
}
