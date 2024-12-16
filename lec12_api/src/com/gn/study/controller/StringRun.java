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
	}
}
