package com.gn.homework04.run;

import com.gn.homework04.controller.ExMethodController;

public class Run {
	public static void main(String[] args) {
		ExMethodController ex = new ExMethodController();
		
		ex.printMsg("안녕하세요");
		
		int answer2 = ex.sumOneToHundred();
		System.out.println(answer2);
		
		String answer3 = ex.judgeOddEven(15);
		System.out.println(answer3);
		
		boolean answer4 = ex.containsEng("abc");
		System.out.println(answer4);
		
		int answer5 = ex.countChar("classmates", 's');
		System.out.println(answer5);
		
		ex.gugudan(4);
	}
}
