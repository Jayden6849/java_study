package com.gn.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] strArr = sentence.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].contains(input)) {
				System.out.println(strArr[i+1]);
				break;
			} else if(strArr[strArr.length-1].equals(input)) {
				System.out.println("마지막 단어입니다.");
				break;
			} else {
				if(i==strArr.length-1)
				System.out.println("존재하지 않는 단어입니다.");
			}
		}
		
		sc.close();
	}
}
