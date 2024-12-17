package com.gn.practice06;

public class Practice {
	public String method() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		
		sb.append("!");
		sb.insert(0, "<< ");

		StringBuilder tmp = new StringBuilder(sb);
		
		String[] arr = tmp.toString().split(" ");
		String target = "";
		
		for(int i=0; i<arr.length; i++) {
			target = arr[arr.length/2];
		}
		
		sb.delete(sb.indexOf(target), sb.indexOf(target)+target.length()+1);
		
		sb.reverse();		
		
		return sb.toString(); 
	}
}
