package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice {
	public long method1(String directory) {
		long start = System.nanoTime();
		
		File dir = new File(directory);
		File file = new File(dir, "나비야1.dat");
		
		try(FileInputStream fis = new FileInputStream(file)) {
			byte[] bArr = new byte[(int)file.length()];
			byte[] buffer = new byte[10];
			
			int idx = 0;
			int data = 0;
			while(true) {
				data = fis.read(buffer);
				if(data == -1) break;
				System.arraycopy(buffer, 0, bArr, idx, data);
				idx += data;
			}
			
			String str = new String(bArr);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
	public long method2(String directory) {
		long start = System.nanoTime();
		
		File dir = new File(directory);
		File file = new File(dir, "나비야2.dat");
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
}
