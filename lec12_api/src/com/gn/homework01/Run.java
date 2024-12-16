package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] strArr = str.split("\n");

		String[] param = new String[4];
		Person p1 = null;
		Person p2 = null;
		Person p3 = null;
		
		for(int i=0; i<strArr.length; i++) {
			param = strArr[i].split(",");
			switch(i) {
			case 0:
				p1 = new Person(param[0], Integer.parseInt(param[1]), param[2], param[3].charAt(0));
				break;
			case 1:
				p2 = new Person(param[0], Integer.parseInt(param[1]), param[2], param[3].charAt(0));
				break;
			case 2:
				p3 = new Person(param[0], Integer.parseInt(param[1]), param[2], param[3].charAt(0));
				break;
			}
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
