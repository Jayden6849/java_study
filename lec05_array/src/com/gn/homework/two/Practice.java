package com.gn.homework.two;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[][] arr = new int[4][4];
		
		int cnt = arr.length * arr[0].length;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j==arr[i].length-1) System.out.println(arr[i][j]);
				else System.out.print(arr[i][j] + " ");
			}
		}
	}
	public void practice02() {
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j==arr[i].length-1) System.out.println(arr[i][j]);
				else System.out.print(arr[i][j] + " ");
			}
		}
	}
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		int input1 = 0;
		int input2 = 0;
		
		while(true) {
			System.out.print("행 : ");
			input1 = sc.nextInt();
			System.out.print("열 : ");
			input2 = sc.nextInt();
			
			if(!((1<=input1 && input1<=10) && (1<=input2 && input2<=10))) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			} else {
				sc.close();
				break;
			}
		}
		
		char[][] arr = new char[input1][input2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random()*26+65));
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j==arr[i].length-1) System.out.println(arr[i][j]);
				else System.out.print(arr[i][j] + " ");
			}
		}
	}
	public void practice04() {
		String[][] strArr 
		= new String[][] {
		{"이", "까", "왔", "앞", "힘"}, 
		{"차", "지", "습", "으", "냅"}, 
		{"원", "열", "니", "로", "시"}, 
		{"배", "심", "다", "좀", "다"}, 
		{"열", "히", "! ", "더", "!! "}
		};
		
		int row = strArr.length;
		int column = strArr[0].length;
		
		for(int i=0; i<column; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}
	public void practice05() {
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "흥하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int index = 0;
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = arr[index++];
				if(j==arr1[i].length-1) System.out.println(arr1[i][j]);
				else System.out.print(arr1[i][j] + " ");
			}
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr2[i][j] = arr[index++];
				if(j==arr2[i].length-1) System.out.println(arr2[i][j]);
				else System.out.print(arr2[i][j] + " ");
			}
		}
	}
	public void practice06() {
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "흥하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int index = 0;
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = arr[index++];
				if(j==arr1[i].length-1) System.out.println(arr1[i][j]);
				else System.out.print(arr1[i][j] + " ");
			}
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr2[i][j] = arr[index++];
				if(j==arr2[i].length-1) System.out.println(arr2[i][j]);
				else System.out.print(arr2[i][j] + " ");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		String row = "";
		String column = "";
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(arr1[i][j].equals(name)) {
					if(i==0) row = "첫";
					else row = "두";
					if(j==0) column = "왼쪽";
					else column = "오른쪽";
					System.out.println("검색하신 " + name + " 학생은 1분단 " + row + " 번째 줄 " + column + "에 있습니다.");
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(arr2[i][j].equals(name)) {
					if(i==0) row = "첫";
					else row = "두";
					if(j==0) column = "왼쪽";
					else column = "오른쪽";
					System.out.println("검색하신 " + name + " 학생은 2분단 " + row + " 번째 줄 " + column + "에 있습니다.");
				}
			}
		}
		
		sc.close();
	}
}
