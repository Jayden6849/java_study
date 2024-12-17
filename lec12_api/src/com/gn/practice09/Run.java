package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar target = Calendar.getInstance();
		target.set(2024, 1-1, 1);
		target.set(Calendar.MILLISECOND, 0);
		
		Calendar today = Calendar.getInstance();

		long diff = today.getTimeInMillis() - target.getTimeInMillis();
		long days = diff/(1000*60*60*24);
		
		System.out.println(days + "일 경과");
	}
}
