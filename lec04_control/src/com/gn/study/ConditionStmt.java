package com.gn.study;

public class ConditionStmt {
	public static void main(String[] args) {
		int number = 10;
		
		if (number > 5) {
			int su = 2;
			System.out.println(number + "은/는 5보다 큽니다.");
			System.out.println("su = " + su);
		}
		// System.out.println(su); // error :: lv의 scope를 벗어났음.
	}
}
