package com.gn.practice02.run;

import com.gn.practice02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		SchoolMember[] sm = new SchoolMember[3];
		
		sm[0] = new Student();
		sm[1] = new Teacher();
		sm[2] = new Staff();
		
		for (SchoolMember s : sm) {
			if (s instanceof Student) {
				s.introduce();
				((Student) s).study();
			} else if (s instanceof Teacher) {
				s.introduce();
				((Teacher) s).teach();
			} else if (s instanceof Staff) {
				s.introduce();
				((Staff) s).work();
			}
		}
	}
}
