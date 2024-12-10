package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.CharacterController;
import com.gn.homework03.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner	sc = new Scanner(System.in);
		
		String input = "";
		
		System.out.print("문자열 : ");
		input = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		
		try {
			System.out.println("\'" + input + "\'에 포함된 영문자 개수 : " + cc.countAlpha(input));
		} catch (CharCheckException cce) {
			cce.printStackTrace();
		}
		
		sc.close();
	}
}
