package com.gn.practice08.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Set<Person> set1 = new HashSet<>();
		Set<Person> set2 = new HashSet<>();
		
		set1.add(new Person("홍길동", 20));
		set1.add(new Person("이순신", 25));
		set1.add(new Person("유관순", 22));
		
		set2.add(new Person("유관순", 22));
		set2.add(new Person("강감찬", 27));
		set2.add(new Person("을지문덕", 30));
		
		System.out.println("=== 합집합 ===");
		Set<Person> union = new TreeSet<>(set1);
		union.addAll(set2);
		
		Iterator<Person> iter1 = union.iterator();
		
		int cnt = 1;
		while(iter1.hasNext()) {
			System.out.println(cnt+"번 "+iter1.next());
			cnt++;
		}
		
		System.out.println("=== 교집합 ===");
		Set<Person> intersection = new TreeSet<>(set1);
		intersection.retainAll(set2);
		
		Iterator<Person> iter2 = intersection.iterator();
		
		cnt = 1;
		while(iter2.hasNext()) {
			System.out.println(cnt+"번 "+iter2.next());
			cnt++;
		}
		
		System.out.println("=== 차집합 ===");
		
		Set<Person> difference = new TreeSet<>(set1);
		difference.removeAll(set2);
		
		Iterator<Person> iter3 = difference.iterator();
		
		cnt = 1;
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
			cnt++;
		}
	}
}
