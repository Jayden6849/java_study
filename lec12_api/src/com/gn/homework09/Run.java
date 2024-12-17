package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Calendar open = Calendar.getInstance();
		open.set(Calendar.YEAR, 2025);
		open.set(Calendar.MONTH, 1-1);
		open.set(Calendar.DATE, 24);
		open.set(Calendar.MILLISECOND, 0);
		
		Calendar today = Calendar.getInstance();
		
		Date d_today = today.getTime();
		SimpleDateFormat sdf_today = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		long diff = open.getTimeInMillis() - today.getTimeInMillis();
		long days = diff/(1000*60*60*24);
		
		String openDay = ""; 
		int tmp = open.get(Calendar.DAY_OF_WEEK);
		switch(tmp) {
		case 1: openDay = "일요일"; break;
		case 2: openDay = "월요일"; break;
		case 3: openDay = "화요일"; break;
		case 4: openDay = "수요일"; break;
		case 5: openDay = "목요일"; break;
		case 6: openDay = "금요일"; break;
		case 7: openDay = "토요일"; break;
		}
		
		System.out.println("오늘 날짜 : " + sdf_today.format(d_today));
		System.out.println("카페 오픈일까지 남은 날 : " + days + "일");
		System.out.println("오픈달의 마지막 날 : " + open.getActualMaximum(Calendar.DATE) + "일");
		System.out.println("카페 오픈일의 요일 : " + openDay);
	}
}
