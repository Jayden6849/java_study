package com.gn.homework02.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.gn.homework02.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<>();
	private Set<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	public boolean deleteObject(Lottery l) {
		boolean isDelete = lottery.remove(l);
		if(isDelete == true && win.isEmpty() == false) {
			win.remove(l);
		}
		return isDelete;
	}
	public Set<Lottery> searchObject() {
		return lottery;
	}
	public Set<Lottery> winObject() {
		if(lottery.size() < 4)
			return null;
		
		List<Lottery> tmp = new ArrayList<>(lottery);
		
		while(true) {
			int random = (int)(Math.random() * tmp.size());
			win.add(tmp.get(random));
			if(win.size() == 4)
				break;
		}
		
		return new HashSet<>(win);
	}
	public Set<Lottery> sortedWinObject() {
		Set<Lottery> tmp = new TreeSet<>(win);
		return tmp;
	}
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
