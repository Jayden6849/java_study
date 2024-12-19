package com.gn.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufInputRun1 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\241219");
		
		File file = new File(dir, "sample3.dat");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] bArr = new byte[(int)file.length()];
			byte[] buffer = new byte[10];
			
			int idx = 0;
			int data = 0;
			
			while(true) {
				data = bis.read(buffer);
				if(data == -1) break;
				System.arraycopy(buffer, 0, bArr, idx, data);
				idx += data;
			}
			
			String str = new String(bArr);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(bis != null)
					bis.close();
				if(fis != null)
					fis.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
