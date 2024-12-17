package com.gn.study.controller;

import java.util.Calendar;

public class DateRun {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;
		
		System.out.println(year + "년 " + month + "월");
		
		Calendar cal2 = Calendar.getInstance();
		
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH) + 1;
		int date2 = cal2.get(Calendar.DATE);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		
		String tmp = "";
		switch(day2) {
		case 1: tmp = "일"; break;
		case 2: tmp = "월"; break;
		case 3: tmp = "화"; break;
		case 4: tmp = "수"; break;
		case 5: tmp = "목"; break;
		case 6: tmp = "금"; break;
		case 7: tmp = "토"; break;
		}
		
		System.out.println(year2+"년 "+month2+"월 "+date2+"일 "+tmp+"요일");
		
		// 날짜변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE, 25);
		
		System.out.println(christmas);
		
		christmas.set(2024, 12-1, 25);
		System.out.println(christmas);
		
		// 날짜변경(2) : add
		Calendar today = Calendar.getInstance();
		
		today.add(Calendar.DATE, 7);
		
		// 문자열 형태의 데이터를 날짜정보로 변환하기
		String toDay = "2024-05-14";
		
		String[] temp = toDay.split("-");
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])-1, Integer.parseInt(temp[2]));
		
		System.out.println(calendar);
		
		calendar.add(Calendar.MONTH, -1);
		System.out.println(calendar);
		
		// 두 날짜 사이의 차이를 구하기 :: D-Day 계산 - getInMillis();
		Calendar birthday = Calendar.getInstance();
		birthday.set(2024, 10-1, 16);
		Calendar today2 = Calendar.getInstance();
		
		long diff = today2.getTimeInMillis() - birthday.getTimeInMillis();
		
		System.out.println(diff/1000 + "초");
		System.out.println(diff/(1000*60) + "분");
		System.out.println(diff/(1000*60*60) + "시간");
		System.out.println(diff/(1000*60*60*24) + "일");
	}
}
