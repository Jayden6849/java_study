package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		
		File file = new File(dir, "애국가1.dat");
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream(file);
			
			byte[] bArr = new byte[(int)file.length()];
			byte[] buffer = new byte[10];
			
			int idx = 0;
			int data = 0;
			
			while(true) {
				data = in.read(buffer);
				if(data == -1)
					break;
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
				if(in != null)
					in.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
