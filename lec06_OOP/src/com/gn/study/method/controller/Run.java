package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
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
		
		System.out.println("========");
		myPhone.checkWork();
		System.out.println("========");
		
		Library lib = new Library();
		
		lib.borrowBooks("해리포터", "반지의 제왕", "데미안", "햄릿");
		lib.borrowBooks("다빈치코드", "개미");
		
		lib.returnBooks(1000, "1984", "파친코");
		
		Hospital hospital = new Hospital();
		
		hospital.emergencyCall();
//		hospital.doctorCall();	// 같은 패키지도 아니고, 상속받은 클래스도 아님
//		hospital.staffAnnouncement(); // 같은 패키지가 아님
//		hospital.personalRecore(); // 같은 클래스가 아님
		
		Hospital.printInfo();
	}
}
