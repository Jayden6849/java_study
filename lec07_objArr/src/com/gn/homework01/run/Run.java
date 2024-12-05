package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[10];
		
		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
		}
		
		int count = 0;
		
		exter:
		while(true) {
			System.out.print("학년 : ");
			students[count].setGrade(sc.nextInt());
			sc.nextLine();
			
			System.out.print("반 : ");
			students[count].setClassroom(sc.nextInt());
			sc.nextLine();
			
			System.out.print("이름 : ");
			students[count].setName(sc.nextLine());
			
			System.out.print("국어점수 : ");
			students[count].setKor(sc.nextInt());
			sc.nextLine();
			
			System.out.print("영어점수 : ");
			students[count].setEng(sc.nextInt());
			sc.nextLine();
			
			System.out.print("수학점수 : ");
			students[count].setMath(sc.nextInt());
			sc.nextLine();
			
			count++;
			
			inner:
			while(true) {
				System.out.print("계속 추가하시겠습니까? ");
				String answer = sc.nextLine();
				if("y".equalsIgnoreCase(answer)) continue exter;
				else if("n".equalsIgnoreCase(answer)) break exter;
				else continue inner;
			}
		}
		
		for(int i=0; i<students.length; i++) {
			if(students[i].getName() != null)
				System.out.println(students[i].information());
		}
		
		sc.close();
	}
}
