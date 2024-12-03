package com.gn.submit;

import java.util.Scanner;

public class Submit02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		for(char ch = 'a'; ch<='z'; ch++) {
			if(Submit02.Solution(str, ch) != 0)
				System.out.println(ch + ":" + Submit02.Solution(str, ch) + "개");
		}
		
		scan.close();
	}
	
	public static int Solution(String str, char ch) {
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) count++;
		}
		
		return count;
	}
}
