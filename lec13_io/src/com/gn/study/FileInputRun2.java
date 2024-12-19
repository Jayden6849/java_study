package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputRun2 {
	public static void main(String[] args) {
		// 1. 디렉토리 지정
		File dir = new File("C:\\test\\241219");
		
		// 2. 파일 지정
		File file = new File(dir, "sample2.dat");
		
		// 3. FileInputStream 객체 선언, 생성
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(file);
			
			// 4. 데이터를 저장할 배열 생성
			byte[] bArr = new byte[(int)file.length()];
			
			// 5. 배열 단위로 나타낼 배열을 생성
			byte[] standard = new byte[5];
			
			// 6. 읽어오기
			int idx = 0;
			int data = 0;
			while(true) {
				data = in.read(standard);
				if(data == -1)
					break;
				System.arraycopy(standard, 0, bArr, idx, data);
				idx += data;
			}
			
			// 7. 확인하기
			String str = new String(bArr);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.addSuppressed(ie);
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
