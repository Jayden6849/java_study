package com.gn.homework03.model.vo;

public class MethodTest {
	public String method01(String str1, String str2) {
		return str1.concat(str2);
	}
	
	public int method02(int num1, int num2) {
		if(num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return num1 * num2;
	}
	
	public boolean method03(String str1, String str2) {
		if(str1.equals(str2))
			return true;
		else
			return false;
	}
}
