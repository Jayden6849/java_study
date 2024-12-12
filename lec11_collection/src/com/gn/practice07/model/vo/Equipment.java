package com.gn.practice07.model.vo;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;
	
	public Equipment() {
		super();
	}
	public Equipment(String name, int pricePerDay) {
		super();
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Equipment) {
			Equipment other = (Equipment) obj;
			result = this.name.equals(other.name) && this.pricePerDay == other.pricePerDay;
		}
		return result;
	}
	@Override
	public String toString() {
		return "- "+name+" : "+pricePerDay+"원";
	}
}
