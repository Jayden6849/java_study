package com.gn.study.controller;

import java.util.*;

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
		
		// 3. <key, 객체> 형태의 map
		Map<String, Snack> snackMap = new HashMap<>();
		
		snackMap.put("다이제", new Snack("초코", 1700));
		snackMap.put("새우깡", new Snack("새우", 900));
		snackMap.put("포테이토칩", new Snack("양파", 500));
		
		System.out.println(snackMap);
	}
}
