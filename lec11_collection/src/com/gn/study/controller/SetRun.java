package com.gn.study.controller;

import java.util.HashSet;
import java.util.Set;

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
		
	}
}
