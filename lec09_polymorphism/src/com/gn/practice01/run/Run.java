package com.gn.practice01.run;

import com.gn.practice01.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Person[] arr = new Person[2];
		
		arr[0] = new Student();
		arr[1] = new Employee();
		
		for(Person p : arr) {
			p.introduce();
		}
	}
}	
