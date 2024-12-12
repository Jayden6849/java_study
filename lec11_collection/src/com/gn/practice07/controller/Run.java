package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<>();
		Set<Equipment> storage2 = new HashSet<>();
		
		storage1.add(new Equipment("라켓", 15000));
		storage1.add(new Equipment("배트", 6000));
		storage1.add(new Equipment("축구공", 3000));
		
		storage2.add(new Equipment("배트", 6000));
		storage2.add(new Equipment("야구공", 5000));
		storage2.add(new Equipment("글로브", 9000));
		
		System.out.println("*** 합집합 ***");
		
		Set<Equipment> union = new HashSet<>(storage1);
		union.addAll(storage2);
		
		Iterator<Equipment> iter1 = union.iterator();
		
		while(iter1.hasNext()) {
			Equipment other = iter1.next();
			System.out.println(other);
		}
		
		System.out.println("*** 교집합 ***");
		
		Set<Equipment> intersection = new HashSet<>(storage1);
		intersection.retainAll(storage2);
		
		Iterator<Equipment> iter2 = intersection.iterator();
		
		while(iter2.hasNext()) {
			Equipment other = iter2.next();
			System.out.println(other);
		}
		
		System.out.println("*** 차집합 ***");
		
		Set<Equipment> difference = new HashSet<>(storage1);
		difference.removeAll(storage2);
		
		Iterator<Equipment> iter3 = difference.iterator();
		
		while(iter3.hasNext()) {
			Equipment other = iter3.next();
			System.out.println(other);
		}
	}
}
