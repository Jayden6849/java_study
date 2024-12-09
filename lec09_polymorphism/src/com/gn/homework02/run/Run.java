package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Run {
	public static void main(String[] args) {
		Menu[] arr = new Menu[5];
		
		arr[0] = new Dish("스테이크", 20000, "안심");
		arr[1] = new Dish("파스타", 20000, "토마토");
		arr[2] = new Drink("카푸치노", 4000, "원두");
		arr[3] = new Dish("피자", 20000, "포테이토");
		arr[4] = new Drink("아메리카노", 4000, "원두");
		
		for(int i=0; i<arr.length; i++) {
			arr[i].cook();
		}
	}
}
