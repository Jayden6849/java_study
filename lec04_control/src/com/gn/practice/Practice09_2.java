package com.gn.practice;

public class Practice09_2 {
	public static void main(String[] args) {
		int result = 0;
		
		for(int i=2; i<=9; i++) {
			if(result == 45) break;
			System.out.println("===" + i + "단===");
			for(int j=1; j<=9; j++) {
				result = i*j;
				System.out.println(i+" * "+j+" = "+ result);
			}
		}
		System.out.println("계산 결과가 " + result + "입니다.");
	}
}
