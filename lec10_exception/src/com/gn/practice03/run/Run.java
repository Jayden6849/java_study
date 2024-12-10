package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		sc.nextLine();
		
		LoginManager loginManager = new LoginManager();
		try {
			loginManager.login(id, pwd);
		} catch(InvalidCredentialsException ice) {
			System.out.println(ice.getMessage());
		}
		
		sc.close();
	}
}
