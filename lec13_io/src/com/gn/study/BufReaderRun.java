package com.gn.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufReaderRun {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		
		File file = new File(dir, "sample2.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder();
			String data = null;
			while(true) {
				data = br.readLine();
				if(data == null)
					break;
				sb.append(data).append("\n");
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
