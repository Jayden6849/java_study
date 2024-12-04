package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
		// 객체생성 = 인스턴스화
		Smartphone myPhone = new Smartphone();
		
		myPhone.openApp();
		
		int battery = myPhone.checkBattery();
		System.out.println("배터리 잔량 : " + battery + "%");
		
		myPhone.setVolume(25);

		String msg = myPhone.sendMsg("자니?");
		System.out.println(msg);
	}
}
