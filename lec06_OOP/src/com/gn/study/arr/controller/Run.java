package com.gn.study.arr.controller;

import java.util.Arrays;

import com.gn.study.arr.model.vo.Academy;

public class Run {
	public static void main(String[] args) {
		// 객체 배열의 선언 및 생성
		Academy[] academy = new Academy[2];
		
		// 객체배열의 초기화		
		academy[0] = new Academy("가남", "000-000-0000");
		academy[1] = new Academy("나남", "111-111-1111");
		
		System.out.println(Arrays.toString(academy));
		
		// 선언과 동시에 초기화하는 방법
		Academy[] academy2 = {new Academy("다남", "222-222-2222"), new Academy("라남", "333-333-3333")};
		
		System.out.println(Arrays.toString(academy2));	
		
		for(int i=0; i<academy.length; i++) {
			System.out.println(academy[i].getName());
		}
		for(Academy ac : academy2) {
			System.out.println(ac.getName());
		}
	}
}
