package com.gn.practice03.run;

import com.gn.practice03.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bicycle();
		
		if(v1 instanceof Car || v1 instanceof Bicycle)
			v1.go();
		if(v2 instanceof Car || v2 instanceof Bicycle)
			v2.go();			
	}
}
