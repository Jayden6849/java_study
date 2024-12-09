package com.gn.homework04.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	public SmartPhone() {
		super();
	}
	
	public abstract void printMaker();
}
