package com.gn.study.method.model.vo;

public class Hospital {
	// 1. 누구나 접근할 수 있음 (public)
	public void emergencyCall() {
		System.out.println("응급 전화를 받습니다.");
	}
	
	// 2. 의사만 받을 수 있음 (protected)
	protected void doctorCall() {
		System.out.println("의사만 받는 전화입니다.");
	}
	
	// 3. 병원 내부에 있는 사람만 받을 수 있음 (default)
	void staffAnnouncement() {
		System.out.println("스태프 공지를 확인합니다.");
		personalRecord();	// private 메소드는 이런식으로 내부적인 연산을 하는데 사용하게 됨
	}
	
	// 4. 개인 의료 기록 (private)
	private void personalRecord() {
		System.out.println("개인 의료 기록을 열람합니다.");
	}
	
	// 5. 병원 정보 출력
	public static void printInfo() {
		System.out.println("저희 병원은 oo시 oo구에 있습니다.");
	}
}
