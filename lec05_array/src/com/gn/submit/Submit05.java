package com.gn.submit;

import java.util.Scanner;

public class Submit05 {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
				
		int[] result = {0, 0, 0, 0, 0, 0};
		
		for(int i=0; i<coin.length; i++) {
			if(num/coin[i] > cnt[i]) {
				result[i] = 5;
				num -= coin[i] * 5;
			} else {
				result[i] = num/coin[i];
				num -= coin[i] * result[i];
			}
		}

		if(num == 0) {
			for(int i=0; i<result.length; i++) {
				System.out.println(coin[i] + "원:" + result[i]);	
			}
			for(int i=0; i<result.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원:" + (cnt[i]-result[i]) + "개");
			}
		} else if(num > 0)
			System.out.println("동전이 부족합니다.");
		
		scan.close();
	}
}
