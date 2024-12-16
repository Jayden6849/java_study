package com.gn.homework02;

public class Practice {
	public String takeState(String state) {
		String[] temp = state.split(" ");
		
		for(int i=0; i<temp.length; i++) {
			if (temp[i].indexOf("구") == temp[i].length()-1) {
				return temp[i];
			}
		}
		
		return null;
	}
}
