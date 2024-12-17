package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 일주일 뒤의 날짜정보를 출력하고 싶음
		// 00월 00일 0요일
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, +7);
		
		Date d = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(d));
		
		// 오늘 날짜를 기준으로 한 달 뒤의 날짜 정보를 출력하고 싶음
		// 00월 00일 0요일
		Calendar today2 = Calendar.getInstance();
		today2.add(Calendar.MONTH, +1);
		
		Date d2 = today2.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf2.format(d2));
		
		// 현재 시점 기준으로 양식 맞춰서 출력하기
		Calendar day = Calendar.getInstance();
		
		Date dt = day.getTime();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd(E) a HH:mm:ss:SSS");
		System.out.println(sd.format(dt));
	}
}
