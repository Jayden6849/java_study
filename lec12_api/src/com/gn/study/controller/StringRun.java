package com.gn.study.controller;

import java.util.Arrays;

public class StringRun {
	public static void main(String[] args) {
		// 1. 불변객체
		String str = "Hello";
		
		System.out.println("str(Hello) : " + System.identityHashCode(str));
		
		str += "world";
		
		System.out.println(System.identityHashCode(str));
		
		// 2. 리터럴방식
		String str1 = "Hello";
		System.out.println("str1(Hello) : " + System.identityHashCode(str1)); // 918221580 동일함 - 왜? String Pool
		
		String str2 = new String("Hello");
		System.out.println("str2(Hello) : " + System.identityHashCode(str2)); // 객체로 다루면 달라짐
		
		/* 
		 * 즉, 무조건 리터럴폼으로만 쓴다고 생각하면 ==으로 비교를 할 수도 있겠으나
		 * 객체로 만들어 사용할 때도 제대로 비교되어야하기 때문에 equals()를 사용해야만 한다
		 */
		
		// 3. equals()
		System.out.println("equals() : " + ("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : " + str2.length());
		// 5. charAt(index i);
		System.out.println("charAt(0) : " + str2.charAt(0));
		// 6. toCharArray();
		char[] chArr = str2.toCharArray();
		System.out.println(Arrays.toString(chArr));
		// 7. contains();
		System.out.println("contains() : " + str2.contains("llo"));
		// 8. compareTo();
		System.out.println("compareTo() : " + str2.compareTo("ZZZ")); // 음수이므로 사전상 빠름
		// 9. concat();
		System.out.println("concat() : " + str2.concat(" world").concat("!!"));
		System.out.println(str2); // 불변객체의 특징 -> 불변객체로 쓰지 않으려면 StringBuilder, StringBuffer
		
		// 10. lastIndexOf();
		String test = "2024.12.16.12.43";
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12"));
		
		// 11. split();
		String name = "김 철 수";
		String[] nameArr = name.split(" ");
		for(String n : nameArr) {
			System.out.print(n);
		}
		System.out.println();
		
		// 12. replace()
		String ide = "eclipse";
		String ide2 = ide.replace("e", "a");
		System.out.println(ide2);
		
		System.out.println(name);
		System.out.print(name.replace(" ", "") + "\n");
		
		// 13. isBlank(), isEmpty()
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) \"\" isBlack? : " + empty1.isBlank());
		System.out.println("(2) \"\" isEmpty? : " + empty1.isEmpty());
		System.out.println("(3) \" \" isBlank? : " + empty2.isBlank());
		System.out.println("(4) \" \" isEmpty? : " + empty2.isEmpty());
		
		System.out.println(empty1.length() == 0);
		System.out.println(empty2.length() == 0);
		
		String empty3 = " 안 녕 하 세 요 ";
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		// 14. join()
		String[] students = {"철수", "영희", "길동"};
		System.out.println(String.join(", ", students));
		
		// 15. substring()
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0, 5));
		
		String file = "test.jpg";
		String filename = file.substring(0, file.lastIndexOf("."));
		String ex = file.substring(file.lastIndexOf(".")+1);
		System.out.println(filename);
		System.out.println(ex);
		
		// 16. .valueOf
		final double PI = 3.14;
		String piStr = String.valueOf(PI);
		System.out.println(piStr);
		
		// 17. StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append("World!!");
		System.out.println(sb);
		
		sb.insert(5, " Java ");
		System.out.println(sb);
		
		sb.delete(11, 16+1);
		System.out.println(sb);
		
		sb.deleteCharAt(sb.lastIndexOf(" "));
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		Practice p = new Practice();
		System.out.println(p.append(" checked"));
	}
}
