package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] employee = new Employee[10];
		
		int cnt=0;
		
		exter:
		while(true) {
			System.out.println("=== 사원 입력받기 ===");
			
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.next();
			sc.nextLine();
			
			employee[cnt] = new Employee(name, age, height, weight, salary, dept);
			
			inner:
			while(true) {
				System.out.print("계속 추가하시겠습니까?(Y/N) ");
				String selection = sc.next();
				sc.nextLine();
				
				if("y".equalsIgnoreCase(selection)) {
					cnt++;
					continue exter;
				} else if("n".equalsIgnoreCase(selection)) {
					break exter;
				} else {
					continue inner;
				}
			}
		}
		
		for(int i=0; i<employee.length; i++) {
			if(!(employee[i] == null || employee.length == 0))
				System.out.println(employee[i]);
		}
			
		sc.close();
	}
}
