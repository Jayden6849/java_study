package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
		Set<Food> foodSet = new HashSet<>();
		
		foodSet.add(new Food("샐러드", 14000));
		foodSet.add(new Food("치킨", 23000));
		foodSet.add(new Food("치킨", 50000));
		
		System.out.print("5만원 치킨 취소 : ");
		foodSet.remove(new Food("치킨", 50000));
		System.out.println(foodSet);
		
		System.out.print("전체 치킨 취소 : ");
		foodSet.clear();
		System.out.println(foodSet);
	}
}
