package com.gn.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		// 2. 파일의 생성
		File file = new File(dir, "sample1.dat");
		
		// 3. FileOutputStream 선언과 생성
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			// 4. 출력할 데이터의 구성
			String str = "Hello";
			byte[] bArr = str.getBytes();
			// 5. 출력
			out.write(bArr);
			// 6. 플러싱(선택)
			out.flush();
			System.out.println(file.length()+"크기의 "+file.getPath()+" 파일 생성");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 7. 스트림 닫기
			try {
				if(out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
