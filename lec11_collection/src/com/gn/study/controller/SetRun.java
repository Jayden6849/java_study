package com.gn.study.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Product;
import com.gn.study.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		System.out.println(class1);
		
		Set<Integer> class2 = new HashSet<>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		System.out.println(class2);
		
		System.out.println("=== 합집합 ===");
//		class1.addAll(class2);
//		System.out.println("class1 : " + class1);
//		System.out.println("class2 : " + class2);
		
		Set<Integer> union = new HashSet<>(class1);
		union.addAll(class2);
		System.out.println(union);
		
		System.out.println("=== 교집합 ===");
		
		Set<Integer> intersection = new HashSet<>(class1);
		intersection.retainAll(class2);
		System.out.println(intersection);
		
		System.out.println("=== 차집합 ===");
		
		Set<Integer> difference = new HashSet<>(class1);
		difference.removeAll(class2);
		System.out.println(difference);
		
		System.out.println("================================");
		
		Set<Student> set1 = new HashSet<>();
		set1.add(new Student("철수", 20));
		set1.add(new Student("우석", 28));
		set1.add(new Student("은우", 30));
		
		Set<Student> set2 = new HashSet<>();
		set2.add(new Student("철수", 20));
		set2.add(new Student("길동", 25));
		
		Set<Student> us = new HashSet<>(set1);
		us.addAll(set2);
		System.out.println(us);
		
		Set<Student> is = new HashSet<>(set1);
		is.retainAll(set2);
		System.out.println(is);
		
		Set<Student> ds = new HashSet<>(set1);
		ds.removeAll(set2);
		System.out.println(ds);
		
		System.out.println(set1.containsAll(set2));
		
		System.out.println("=== iterator ===");
		
		Set<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		
		Iterator<String> iter = fruits.iterator();
		
		while(iter.hasNext()) {
			String fruit = iter.next();
			System.out.print(fruit);
			iter.remove();
			if(fruits.size() != 0)
				System.out.print(", ");
		}
		
		System.out.println();
		System.out.println("=== LinkedHashSet ===");
		
		Set<String> set4 = new LinkedHashSet<>();
		
//		set4 = new HashSet<>(); // HashSet에 넣으면 순서를 기억하지 못함
		set4 = new TreeSet<>(); // TreeSet에 넣으면 정렬까지 해서 순서를 기억함
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		
		System.out.println(set4);
		
		Set<Product> products = new TreeSet<>();
		
		products.add(new Product("젤리", 2000));
		products.add(new Product("사탕", 500));
		products.add(new Product("홍삼", 8000));
		
		System.out.println(products); // 정렬기준이 없기때문에 정렬할 수가 없음
	}
}
