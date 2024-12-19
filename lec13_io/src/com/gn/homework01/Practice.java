package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	public void method1(String song) {
		File dir = new File("C:\\test\\sub");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		File file = new File(dir, "나비야1.dat");
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(file);
			
			byte[] bArr = song.getBytes();
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
	public void method2(String song) {
		File dir = new File("C:\\test\\sub");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		File file = new File(dir, "나비야2.dat");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			byte[] bArr = song.getBytes();
			bos.write(bArr);
			
			bos.flush();
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(bos != null)
					bos.close();
				if(fos != null)
					fos.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
