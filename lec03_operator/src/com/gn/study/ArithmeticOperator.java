package com.gn.study;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// 1. 산술연산자
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.printf("%.3f\n", num1/(double)num2);
		
		// 2. 복합대입연산자
		int a = 5;
		System.out.println("a = " + a);
		a += 3;
		System.out.println("a = " + a); // 8
		
		int b = 10;
		System.out.println("b = " + b);		
		b -= 4;
		System.out.println("b = " + b); // 6
		b*=5;
		System.out.println("b = " + b); // 30
		
		int c = 10;
		c /= 3;
		System.out.println("c = " + c); // 3
		
		int d = 10;
		d %= 3;
		System.out.println("d = " + d); // 1
		
		// 홀수와 짝수를 나누는 메커니즘
		// 2로 나누어 나머지가 1이면 홀수, 0이면 짝수
		
		if(a%2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		// 3. 증감연산자 ++ --
		int pre = 5;
		System.out.println(pre); // 5
		System.out.println(++pre); // 6 :: 더해진 후 출력됨 (해당 라인에서 연산)
		System.out.println(pre); // 6
		
		int post = 5;
		System.out.println(post); // 5
		System.out.println(post++); // 5 :: 출력된 후 더해짐 (다음 라인에서 연산)
		System.out.println(post); // 6
		
		
		
	}
}
