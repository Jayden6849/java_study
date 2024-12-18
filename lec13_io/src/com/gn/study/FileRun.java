package com.gn.study;

import java.io.File;

public class FileRun {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		// (1) 파일 객체의 선언 및 생성
		File f1 = new File("C:\\exampleDir");
		// (2) 디렉토리 생성
		f1.mkdir();
		
		File f2 = new File("C:\\parentDir\\childDir");
		f2.mkdir(); // parentDir이 없기 때문에 생성이 안 됨
		f2.mkdirs(); // parentDir이 없기 때문에 생성이 안 됨
	}
}
