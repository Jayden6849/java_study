package com.gn.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise03 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		
		array.add("Benz");
		array.add("Lamborghini");
		array.add("Audi");
		array.add("Ferrari");
		
		// 1번 방법
		System.out.println(array);
		
		// 2번 방법
		Iterator<String> iter = array.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		// 3번 방법
		for (String s : array) {
			System.out.println(s);
		}
	}
}
