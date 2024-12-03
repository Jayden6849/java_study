package com.gn.practice;

public class Practice06 {
	public static void main(String[] args) {
		String[][] arr = new String[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + "," + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
