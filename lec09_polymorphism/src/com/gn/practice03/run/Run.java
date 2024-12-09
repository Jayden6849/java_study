package com.gn.practice03.run;

import com.gn.practice03.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bicycle();
		
		v1.go();
		v2.go();			
	}
}
