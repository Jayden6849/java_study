package com.gn.study.controller;

import java.util.HashMap;
import java.util.Map;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		// 1. 선언, 생성, 바인딩
		Map<String, Object> flower = new HashMap<>();
		
		flower.put("Name", "샌더소니아");
		flower.put("Lang", "성공");
		flower.put("Price", 40000);
		
		// 2. if. 중복된 Key 사용
		flower.put("Price", 50000); // Key 중복되면 오버라이딩 됨
		
		System.out.println(flower);
		
		// 4. HashMap 요소 조회
		System.out.println("===================");
		
		System.out.println(flower.get("Name"));
		
		String f_name1 = (String) flower.get("Lang");
		System.out.println(f_name1);
		
		// 3. <key, 객체> 형태의 map
		System.out.println("===================");
		
		Map<String, Snack> snackMap = new HashMap<>();
		
		snackMap.put("다이제", new Snack("초코", 1700));
		snackMap.put("새우깡", new Snack("새우", 900));
		snackMap.put("포테이토칩", new Snack("양파", 500));
		
		System.out.println(snackMap);
		
		// 5. 제네릭이 객체일 때 요소 조회
		System.out.println("===================");
		Snack s_name1 = snackMap.get("다이제");
		System.out.println(s_name1);
		
		System.out.println(snackMap.get("새우깡"));
		System.out.println(snackMap.get("포테이토칩"));
		
		System.out.println("===================");
		Snack s1 = snackMap.get("다이제");
		s1.setFlavor("소금");
		s1.setCalory(1200);
		System.out.println(s1);
		System.out.println(snackMap);
		
		System.out.println("===================");		
		
	}
}
