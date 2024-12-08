package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Chocolate;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		
		String result = "밀가루 : " + c.getFlour() + "(g)\n"
				+ "크림 : " + c.getCream() + "(g)\n"
				+ "체리 : " + c.getCherry() + "(개)\n"
				+ "초콜릿 칩 : " + c.getChip() + "(개)\n"
				+ "초콜릿 케이크가 완성되었습니다.";
		return result;
	}
}
