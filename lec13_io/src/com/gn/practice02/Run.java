package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		
		String fileName = UUID.randomUUID().toString().replace("-", "");
		File file = new File(dir, fileName+".txt");
		
		// 경로 생성
		if(!dir.exists()) {
			if(dir.mkdirs())
				System.out.println("디렉토리 생성 완료");
		}
		
		// 파일 생성
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
