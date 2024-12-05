package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(3, 5);
		
		rec1.printInfo();
		rec2.printInfo();
	}
}
