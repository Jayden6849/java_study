package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 지정
		File dir = new File("C:\\test\\sub");
		
		// 2. 파일의 위치 지정
		File file = new File(dir, "sample1.dat");
		
		// 3. FileInputStream 선언 및 생성
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(file);
			
			// 4. 읽은 데이터를 보관할 배열을 생성
			byte[] bArr = new byte[(int)file.length()];
			
			// 5. 읽어오기 (-1 나올때까지 읽음)
			// (1) 읽어온 데이터를 담을 변수 선언
			int idx = 0;
			int c;
			// (2) 반복문을 통해 파일 내부 정보를 읽어옴
			while(true) {
				c = in.read();
				
				if(c == -1)
					break;
				
				bArr[idx++] = (byte)c;
			}
			
			// 6. 확인하기
			String str = new String(bArr);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			// 7. 닫아주기
			try {
				if(in != null)
					in.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
