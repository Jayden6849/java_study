package com.gn.homework04.run;

import com.gn.homework04.model.vo.*;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] arr = new SmartPhone[2];
		
		arr[0] = new GalaxyS24();
		arr[1] = new Iphone15();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].printMaker();
			arr[i].makeCall();
			arr[i].takeCall();
			arr[i].touch();
			arr[i].charge();
			arr[i].picture();
			System.out.println();
		}
	}
}
