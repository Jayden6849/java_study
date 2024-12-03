package com.gn.submit;

import java.util.Scanner;

public class Submit03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int inputNum = Integer.parseInt(str);
		
		int[] iArr = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			iArr[str.length()-1-i] = inputNum%10;
			inputNum /= 10;
		}
		
		boolean result = true;
		
		for(int i=0; i<(str.length()/2); i++) {
			if(iArr[i] != iArr[str.length()-1-i]) {
				result = false;
				break;
			}
		}
		
		if(result) System.out.println("대칭수");
		else System.out.println("대칭수아님");
		
		scan.close();
	}
}
