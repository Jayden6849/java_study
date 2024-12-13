package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
		Map<String, Planet> planets = new HashMap<>();
		
		planets.put("Mercury", new Planet("수성", 4879, 0.24));
		planets.put("Venus", new Planet("금성", 12104, 0.62));
		planets.put("Earth", new Planet("지구", 12742, 1.0));
		planets.put("Mars", new Planet("화성", 6779, 1.88));
		
		System.out.println("*** keySet() 사용 ***");
		
		Iterator<String> iter1 = planets.keySet().iterator();
		while(iter1.hasNext()) {
			String key = iter1.next();
			String name = planets.get(key).getName();
			int diameter = planets.get(key).getDiameter();
			double period = planets.get(key).getPeriod();
			System.out.println("행성 이름: "+key+"("+name+"), 지름: "+diameter+" km, 공전주기: "+period+"년");
		}
		
		System.out.println("*** entrySet() 사용 ***");
		
		Iterator<Entry<String, Planet>> iter2 = planets.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<String, Planet> entry = iter2.next();
			System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
		}
	}
}
