package com.gn.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		Map<Integer, Fruit> fruits = new HashMap<>();
		
		fruits.put(3, new Fruit("포도", "강화도", 3, 35000));
		fruits.put(2, new Fruit("사과", "영주", 5, 20000));
		fruits.put(1, new Fruit("귤", "제주", 10, 15000));
		fruits.put(4, new Fruit("배", "나주", 7, 50000));		
		
		Map<Integer, Fruit> treeFruits = new TreeMap<>(fruits);

		System.out.println("=== 전체 데이터 조회 ===");
		
		Iterator<Integer> iter1 = treeFruits.keySet().iterator();
		while(iter1.hasNext()) {
			int key = iter1.next();
			Fruit value = treeFruits.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("=== 가격 20000원 이상 ===");
		
		Iterator<Entry<Integer, Fruit>> iter2 = treeFruits.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<Integer, Fruit> entry = iter2.next();
			if(entry.getValue().getPrice() >= 20000) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		System.out.println("=== 이름이 한글자인 과일 ===");
		
		Iterator<Integer> iter3 = treeFruits.keySet().iterator();
		while(iter3.hasNext()) {
			int key = iter3.next();
			Fruit value = treeFruits.get(key);
			if(value.getName().length() == 1) {
				System.out.println(key + " : " + value);
			}
		}
		
		System.out.println("=== 포도 가격 인상 ===");
		
		fruits.put(3, new Fruit("포도", "강화도", 3, 28000));
		
		Iterator<Entry<Integer,Fruit>> iter4 = fruits.entrySet().iterator();
		while(iter4.hasNext()) {
			Entry<Integer, Fruit> entry = iter4.next();
			if(entry.getKey() == 3)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
