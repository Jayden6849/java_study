package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.gn.study.model.vo.Container;

public class Run {
	public static void main(String[] args) {
		// 1. 오토박싱과 언박싱
		Integer iNum1 = 100; 	// 오토박싱
		int iNum2 = iNum1; 		// 언박싱
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		// 2. parse 메소드
		System.out.println("===== parse =====");
		
		String str1 = "123";
		String str2 = "456";
		
		System.out.println(str1+str2);
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		
		str1 = "1.23";
		str2 = "4.56";
		
		System.out.println(str1+str2);
		System.out.println(Double.parseDouble(str1)+Double.parseDouble(str2));
		
		// 3. NumberFormatException
		System.out.println("===== NumberFormatException =====");
		
		String[] arrStr = new String[3];
		arrStr[0] = "일";
		arrStr[1] = "이";
		arrStr[2] = "삼";
		
		try {
			System.out.println(Integer.parseInt(arrStr[0]));
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		// 4. ClassCastException
		System.out.println("===== ClassCastException =====");
		
		Object obj = 9;
		int iObj = (int)obj;
		System.out.println(iObj);
		
		try {
			String strObj = (String)obj; // Integer 를 String 으로 바로 변환하려하면 예외가 발생함
			System.out.println(strObj);
		} catch(ClassCastException cce) {
			cce.printStackTrace();
		}
		
		// 5. Generic
		System.out.println("===== 제네릭 =====");
		
		Container<Integer> container1 = new Container<>();
		Container<String> container2 = new Container<>();
		
		container1.setItem(1);
		container2.setItem("S");
		
		System.out.println(container1.getItem());
		System.out.println(container2.getItem());

		// 6. 컬렉션 프레임워크
		System.out.println("=== 컬렉션 프레임워크 ===");
		
		System.out.println("=== list.add() ===");
		
		Collection<Integer> collection = new ArrayList<>();
		collection.add(3);
	
		List<String> list = new ArrayList<>();
		list.add("안녕하세요");
		System.out.println(list.get(0));
		
		System.out.println("=== list.get() ===");
		
		List<String> meal = new ArrayList<>();
		meal.add("아침");
		meal.add("점심");
		meal.add("저녁");
		
		meal.add(0, "새벽");
		meal.remove(2);
		
		System.out.println(meal);
		
		for(int i=0; i<meal.size(); i++) {
			System.out.println(meal.get(i));
		}
		
		for(String s : meal) {
			System.out.println(s);
		}
		
		Iterator<String> iter = meal.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("==== list.set() ====");
		
		List<Integer> nums = new ArrayList<>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		
		nums.set(1, 500);
		System.out.println(nums);
		
		nums.clear();
		System.out.println(nums);
	}
}
