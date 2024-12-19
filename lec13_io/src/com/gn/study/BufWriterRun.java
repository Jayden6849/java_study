package com.gn.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriterRun {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		// 2. 파일 생성
		File file = new File(dir, "sample2.txt");
		
		// 3. BufferedWriter 선언
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 4. BufferedWriter 생성
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 5. 출력 대상 
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다.");
			bw.newLine();
			
			// 6. 플러싱
			bw.flush();
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(bw != null)
					bw.close();
				if(fw != null)
					fw.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
