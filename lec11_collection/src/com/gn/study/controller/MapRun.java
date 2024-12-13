package com.gn.study.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
		// 6. HashMap 요소 조회 2 - Iterator
		System.out.println("===================");		
		Set<String> keySet = flower.keySet();
				
		Iterator<String> iter1 = keySet.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		System.out.println("===================");	
		
		Iterator<String> iter2 = flower.keySet().iterator();
		while(iter2.hasNext()) {
			System.out.println(flower.get(iter2.next()));
		}
		
		System.out.println("===================");	
		
		Iterator<Entry<String, Object>> iter3 = flower.entrySet().iterator();
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
		}
		
		System.out.println("===================");
		
		Set<Entry<String, Object>> entrySet = flower.entrySet();
		
		Iterator<Entry<String,Object>> iter4 = entrySet.iterator();
		while(iter4.hasNext()) {
			System.out.println(iter4.next());
		}
		
		System.out.println("===================");
		
		// 7. HashMap 요소 조회 총정리
		// (1) keySet()으로 key, value 출력
		Set<String> keySet1 = snackMap.keySet();
		
		Iterator<String> iter5 = keySet1.iterator();
		while(iter5.hasNext()) {
			String key = iter5.next();
			Snack value = snackMap.get(key);
			System.out.println(key + "=" + value);
		
		}
		
		System.out.println("===================");
		// (2) entrySet()으로 entry 출력
		Set<Entry<String, Snack>> entrySet1 = snackMap.entrySet();
		
		Iterator<Entry<String,Snack>> iter6 = entrySet1.iterator();
		while(iter6.hasNext()) {
			Entry<String, Snack> entry = iter6.next();
			System.out.println(entry);
		}
	}
}
