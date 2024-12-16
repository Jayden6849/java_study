package com.gn.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열(1): ");
		String input1 = sc.nextLine();
		System.out.print("문자열(2): ");
		String input2 = sc.nextLine();
		System.out.print("문자열(3): ");
		String input3 = sc.nextLine();
		
		int length1 = input1.length();
		int length2 = input2.length();
		int length3 = input3.length();
		
		String result = "";
		if(length1 > length2) {
			if(length1 > length3) {
				result = input1.concat(input1);
			} else if(length1 < length3) {
				result = input3.concat(input3);
			}
		} else if(length1 < length2) {
			if(length2 > length3) {
				result = input2.concat(input2);
			} else if(length2 < length3) {
				result = input3.concat(input3);
			}
		} else if(length1 == length2 && length2 == length3) {
			if(input1.compareTo(input2) > 0) {
				if(input1.compareTo(input3) > 0) {
					result = input1.concat(input1);
				} else if(input1.compareTo(input3) < 0) {
					result = input3.concat(input3);
				}
			} else if(input1.compareTo(input2) <0) {
				if(input2.compareTo(input3) > 0) {
					result = input2.concat(input2);
				} else if(input2.compareTo(input3) < 0) {
					result = input3.concat(input3);
				}
			}
		}

		System.out.println(result);
		
		sc.close();
	}
}
