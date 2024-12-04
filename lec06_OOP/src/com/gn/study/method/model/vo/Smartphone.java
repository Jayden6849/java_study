package com.gn.study.method.model.vo;

public class Smartphone {
	private int battery;
	private int volume;
	
	// 1. 반환형x, 매개변수x :: 앱 알림 메시지
	public void openApp() {
		System.out.println("앱이 열렸습니다.");
	}
	// 2. 반환형o, 매개변수x :: 배터리 잔량 반환
	public int checkBattery() {
		return battery;
	}
	// 3. 반환형x, 매개변수o :: 볼륨값을 입력하면 현재볼륨을 출력
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("볼륨이 " + volume + "%으로 설정되었습니다.");
	}
	// 4. 반환형o, 매개변수o :: 메시지 전송
	public String sendMsg(String msg) {
		return "메시지 \'" + msg + "\'가 전송되었습니다."; 
	}
	
	// getter, setter
	public int getVolume() {
		return volume;
	}
}
