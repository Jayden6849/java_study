package com.gn.practice06;

public class Practice {
	public String method() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		
		sb.append("!");
		sb.insert(0, "<< ");
		sb.delete(11, 13+1);
		sb.reverse();		
		
		return sb.toString(); 
	}
}
