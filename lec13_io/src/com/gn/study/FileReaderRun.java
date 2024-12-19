package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRun {
	public static void main(String[] args) {
		// 1. 디렉토리 지정
		File dir = new File("C:\\test\\sub");
		
		// 2. 파일 위치 지정
		File file = new File(dir, "sample1.txt");
		
		// 3. FileReader 선언
		FileReader fr = null;
		
		try {
			// 4. FileReader 객체 생성
			fr = new FileReader(file);
			
			// 5. 읽을 단위를 지정 -> int, char[]
			// (1) int 형태로 읽어오기
//			StringBuilder sb = new StringBuilder();
//			int data = 0;
//			while(true) {
//				data = fr.read();
//				if(data == -1)
//					break;
//				sb.append((char)data);
//			}
//			System.out.println(sb.toString());
			
			// (2) char[] 형태로 읽어오기
			StringBuilder sb = new StringBuilder();
			char[] buffer = new char[3];	// 한번에 가져올 문자의 개수
			int data = 0;
			while(true) {
				data = fr.read(buffer);
				if(data == -1)
					break;
				sb.append(buffer, 0, data);
			}
			// 6. 출력
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fr != null)
					fr.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
