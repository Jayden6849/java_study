package com.gn.study.run;

import com.gn.study.model.vo.*;

public class Run {
	public static void main(String[] args) {
		
		// 1. 클래스의 업캐스팅
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		Beverage coffee = new Coffee(); // 더 큰 그릇(상위클래스)에 더 작은 객체(하위클래스)를 담는 행위는 자동형변환이 이루어짐
		coffee.drink(); // 실제 객체가 Coffee 객체이기 때문에 Coffee 에 들어있는 drink() 가 호출된다
		
		Beverage beverage = new Beverage();
		beverage.drink(); // 비교하자면, 실제 객체가 Beverage 객체이기 때문에 Beverage 에 들어있는 drink() 가 호출된다.
		
		Beverage orangeJuice = new OrangeJuice();
		orangeJuice.drink();
		
		System.out.println("=== === === ===");
		
		// 2. 객체 배열과 다형성
		Beverage[] arrBev1 = new Beverage[3];
		arrBev1[0] = new Coffee();
		arrBev1[1] = new OrangeJuice();
		arrBev1[2] = new Beverage();
		
		for(Beverage b : arrBev1) {
			b.drink();
		}

		System.out.println("============");
		
		// 3. 클래스 다운캐스팅
		for(Beverage b : arrBev1) {
			if(b instanceof Coffee)
				((Coffee) b).ice();
			else if (b instanceof OrangeJuice)
				((OrangeJuice) b).fresh();
			else
				System.out.println("다운캐스팅 실패");
		}
		
		// 4. 정적바인딩과 동적바인딩
		
		System.out.println("===== 정적바인딩 =====");
		
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		System.out.println("===== 동적바인딩 =====");
		Planet planet1 = new Planet();
		Planet planet2 = new Earth();
		Planet planet3 = new Mars();
		
		planet1.material();
		planet2.material();
		planet3.material();
		
		// 5. 추상클래스와 추상메소드
		System.out.println("====== 추상클래스 ======");
		Animal dog = new Dog();
		dog.sound();
		Animal cat = new Cat();
		cat.sound();
	}
}
