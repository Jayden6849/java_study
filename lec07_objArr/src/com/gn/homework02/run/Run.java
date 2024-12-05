package com.gn.homework02.run;

import com.gn.homework02.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee();
		arr[1] = new Employee(1, "이영희", 19, 'M', "01022223333", "가산");
		arr[2] = new Employee(2, "김철수", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "구디");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("================================================");
		
		arr[0].setEmpName("홍길동");
		arr[0].setDept("영업부");
		arr[0].setJob("팀장");
		arr[0].setAge(30);
		arr[0].setGender('M');
		arr[0].setSalary(3000000);
		arr[0].setBonusPoint(0.2);
		arr[0].setPhone("01055559999");
		arr[0].setAddress("금천구");
		
		arr[1].setDept("기획부");
		arr[1].setJob("부장");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
				
		for(int i=0; i<arr.length-1; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("================================================");
		
		int[] annualSalary = new int[arr.length];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			annualSalary[i] = (int)(arr[i].getSalary() + (arr[i].getSalary() * arr[i].getBonusPoint()))*12;
			sum += annualSalary[i];
		}
		System.out.printf("홍길동의 연봉 : %d원\n", annualSalary[0]);
		System.out.printf("이영희의 연봉 : %d원\n", annualSalary[1]);
		System.out.printf("김철수의 연봉 : %d원\n", annualSalary[2]);
		
		System.out.println("================================================");
		
		System.out.println("직원들의 연봉의 평균 : " + (sum/arr.length) + "원");
	}
}
