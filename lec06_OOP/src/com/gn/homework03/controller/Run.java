package com.gn.homework03.controller;

import com.gn.homework03.model.vo.MethodTest;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		String answer1 = mt.method01("안녕", "하세요");
		System.out.println(answer1);
		
		int answer2 = mt.method02(2, 3);
		System.out.println(answer2);
		
		boolean answer3 = mt.method03("가나다", "가나다");
		System.out.println(answer3);
	}
}
