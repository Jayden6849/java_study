package com.gn.study.model.vo;

public interface Alarm {
	// 상수 필드
	public static final int MAX_VOLUME = 10;
	
	// 추상 메서드
	public abstract void soundAlarm();
}
