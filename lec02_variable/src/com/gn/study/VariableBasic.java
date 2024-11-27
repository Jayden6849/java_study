package com.gn.study;

public class VariableBasic {
	public static void main(String[] args) {
		// 1. 변수 선언
		int number;
		
		// 2. 변수의 초기화(initiate)
		number = 123;

		// 3. 선언과 초기화를 동시에
		int age = 10;
//		int age = 40; // 선언은 1번만 가능함
		int age2 = 12;
		
		// 4. 변수를 표준출력 해보기
		System.out.println(number);
		System.out.println(age);
		System.out.println(age2);
		
		// 5. 재할당(reallocate)
		int score = 90;
		System.out.println("1 : " + score);
		score = 95;
		System.out.println("2 : " + score);
		
		// 문자열 변수의 초기화
		String str1 = "감사";
		String str2 = new String("합니다");
		System.out.println(str1 + str2);
		
		char[] chArr1 = str1.toCharArray();
		for (char ch : chArr1) {
			System.out.print(ch);
		}
		char[] chArr2 = str2.toCharArray();
		for (char ch : chArr2) {
			System.out.print(ch);
		}
		System.out.println();
		
		// 기본형과 문자열 비교 :: 문자열을 비교할 때는 무조건 equals 사용한다고 외우면 됨.
		String text1 = "Apple";
		String text2 = new String("Apple");
		
		boolean isEqual = (text1 == text2);
		System.out.println(isEqual); // false : 객체가 다르기 때문에 다르다고 나옴 - 주소값이 다름
		
		System.out.println(text1.equals(text2)); // true 내용이 같으므로 같다고 나옴
		System.out.println(text1.compareTo(text2)); // 0 내용이 같으므로 같다고 나옴
		
		String text3 = "Apple";
		System.out.println(text1 == text3); // true : 다른 언어와 같이 사용할 때 문제가 생기기 때문에 피해야함.
		
		/* 
		 * 프론트단에서 데이터를 그대로 가져오게 되면 String str = new String("ABC"); 의 형태를 띔
		 */
		
		// charAt()의 활용한 문자 추출	
		String word = "Hello";
		char first = word.charAt(0);
		System.out.print(first);
		char second = word.charAt(1);
		System.out.print(second);
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(3));
		System.out.print(word.charAt(4));
		System.out.print("\n");
		
		// 업캐스팅 - 할당
		int a = 23;
		double b = a;
		System.out.println(b); //23.0 :: double 으로 업캐스팅
		
		// 업캐스팅 - 연산
		int c = 23;
		double d = 13.1;
		System.out.println(c+d); // 36.1 :: double 으로 업캐스팅
	
		// 업캐스팅 - char 할당
		char test = 'a';
		int test_num = test;
		System.out.println(test_num); // 97
		// 업캐스팅 - char 연산
		char ch1 = 'a';
		char ch2 = 'b';
		System.out.println(ch1+ch2); // 195 :: 97 + 98
		
		System.out.println('2'-'0'); // 2
		System.out.println((char)('f'-32)); // F
		
		// 다운캐스팅
		double d_num = 13.4;
		int i_num = 4;
		
		System.out.println((int)d_num+i_num); // 17 :: 0.4가 손실됨.
	}
}
