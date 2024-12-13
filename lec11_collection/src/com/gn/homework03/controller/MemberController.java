package com.gn.homework03.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.gn.homework03.model.vo.Member;

public class MemberController {
	private Map<String, Member> map = new HashMap<>();
	
	public boolean joinMember(String id, Member m) {
		if(!(map.containsKey(id))) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	}
	public TreeMap<String,String> sameName(String name) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		
//		boolean isEqual = map.containsValue(name);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			if(map.get(id).getName().equals(name))
				treeMap.put(id, name);
		}
		
		return treeMap;
	}
}
