package com.gn.practice;

public class Submit13 {
	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(x*3 + y*2 == 40) {
					System.out.println("x="+x+",y="+y);
				}
			}
		}
	}
}
