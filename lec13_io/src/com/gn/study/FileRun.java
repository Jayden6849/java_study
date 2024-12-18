package com.gn.study;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class FileRun {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		// (1) 파일 객체의 선언 및 생성
//		File f1 = new File("C:\\exampleDir");
		// (2) 디렉토리 생성
//		f1.mkdir();
//		
//		File f2 = new File("C:\\parentDir\\childDir");
//		f2.mkdir(); // parentDir이 없기 때문에 생성이 안 됨
//		f2.mkdirs(); // parentDir이 없기 때문에 생성이 안 됨
//		
		// 2. 디렉토리 삭제
		// (1) 파일 객체의 선언 및 생성
//		File path1 = new File("C:\\exampleDir");
		// (2) 디렉토리 삭제
//		path1.delete();
//		
//		File path2 = new File("C:\\parentDir");
//		path2.delete(); // 하위 디렉토리를 가지고 있어서 삭제가 안 됨
//	
//		File path3 = new File("C:\\parentDir\\childDir");
//		path3.delete();
//		path2.delete(); // 이런 식으로 가장 아래있는 것부터 순차적으로 삭제
//		
		// 3. 디렉토리 존재여부 확인
//		File f3 = new File("C:\\testDir");
//		if(!f3.exists()) {
//			if(f3.mkdirs())
//				System.out.println("정상적으로 생성");
//			else
//				System.out.println("생성 실패");
//		} else {
//			System.out.println("이미 존재하는 경로");
//		}
//		if(f3.exists()) {
//			if(f3.delete()) {
//		 		System.out.println("정상 삭제");
//		 	} else {
//		 		System.out.println("삭제 실패");
//		 	}
//		}
//		
//		if(f3.exists()) {
//			f3.delete();
//		} else {
//			f3.mkdirs();
//		}
//		
		// 4. 파일 생성
		// (1) 디렉토리와 파일은 따로따로 하는 생성하는 것이 효과적
//		File dir1 = new File("C:\\parentDir\\childDir");
//		File file1 = new File("C:\\parentDir\\childDir\\example.txt");
//		
//		try {
//			if(!dir1.exists()) {
//				dir1.mkdirs();
//			}
//			if(file1.createNewFile()) {
//				System.out.println("파일 생성 성공");
//			} else {
//				System.out.println("파일 생성 실패");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		// 5. 파일 삭제
//		if(file1.exists()) {
//			if(file1.delete()) {
//				System.out.println("파일 삭제 완료");
//			} else {
//				System.out.println("파일 삭제 실패");
//			}
//		}
		
		// 6. 파일, 디렉토리 정보 확인
		// (1) 배열 :: listFiles()
		File testDir = new File("C:\\test\\sub");
		File[] files = testDir.listFiles();
		
		for(File f : files) {
			System.out.println(f);
		}
		
		// (2) 유형 확인
		File test = new File("C:\\test\\sub\\test1.txt");
		if(test.exists()) {
			if(test.isDirectory())
				System.out.println("디렉토리");
			else if(test.isFile())
				System.out.println("파일");
		} else {
			System.out.println("존재하지 않습니다.");
		}
		String type = test.isDirectory() ? "디렉토리" : "파일";
		System.out.println(type);
		
		// (3) 상위 디렉토리
		System.out.println(test.getParent());

		// (4) 이름 확인
		System.out.println(test.getName());
		
		// (5) 전체 경로 확인
		System.out.println(test.getPath());
		
		// (6) 마지막으로 수정된 날짜 정보 확인
		System.out.println(test.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd(E) a HH:mm:ss:SSS");
		System.out.println(sdf.format(test.lastModified()));
		
		long byte1 = test.length();
		double kbSize = byte1/1024.0;
		System.out.println((Math.round(kbSize*Math.pow(10, 2)))/Math.pow(10, 2) + "KB");
		
		UUID rnd = UUID.randomUUID();
		System.out.println(rnd);
		
		// 7. UUID 파일명
		File dir = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		File file = new File(dir, uuid+".dat");
		
		try {
			if(!file.exists())
				file.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
