package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun2 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\241219");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "sample2.dat");
		
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file, true);
			
			String str = "안녕하세요~ 반갑습니다!\n";
			byte[] bArr = str.getBytes();
			out.write(bArr);
			
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(out != null)
					out.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
