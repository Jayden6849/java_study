package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		super();
	}
	
	// 영문자가 몇 개 들어있는지 반환하는 메소드
	public int countAlpha(String s) throws CharCheckException {
		int cnt = 0;
		
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
			else {
				if(('a' <= arr[i] && arr[i] <= 'z') || ('A' <= arr[i] && arr[i] <= 'Z')) cnt++;
			}
		}
		return cnt; 
	}
}
