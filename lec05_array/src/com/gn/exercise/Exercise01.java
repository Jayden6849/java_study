package com.gn.exercise;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] chArr = a.toCharArray();
        
        for(int i=0; i<chArr.length; i++) {
            if('a' <= chArr[i] && chArr[i] <= 'z') chArr[i] -= 32;
            else if('A' <= chArr[i] && chArr[i] <= 'Z') chArr[i] += 32;
            System.out.print(chArr[i]);
        }
        sc.close();
	}
}
