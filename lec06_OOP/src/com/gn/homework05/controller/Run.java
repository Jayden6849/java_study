package com.gn.homework05.controller;

import com.gn.homework05.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member member = new Member();
		
		member.changeName("김철수");
		member.printName();
	}
}