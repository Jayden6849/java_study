package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRun {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		// 2. 파일 생성
		File file = new File(dir, "sample1.txt");
		
		// 3. FileWriter 선언
		FileWriter fw = null;
		
		try {
			// 4. FileWriter 객체 생성
			fw = new FileWriter(file);
			
			// 5. 내보낼 데이터 구성 -> int, char[], String
			int num = '대'; // char 역시 숫자정보이기 때문에 가능함
			char[] chArr = {'한', '민'};
			String str = "국";
			
			// 6. 출력
			fw.write(num);
			fw.write(chArr);
			fw.write(str);
			
			// 7. 플러싱(선택)
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			// 8. 닫기
			try {
				if(fw != null)
					fw.close();
			} catch (IOException ie) {
				ie.printStackTrace();				
			}
		}
	}
}
