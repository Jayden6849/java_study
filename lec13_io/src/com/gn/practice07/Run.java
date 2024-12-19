package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\practice");
		
		File file = new File(dir, "output.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder();
			String data;
			
			while(true) {
				data = br.readLine();
				if(data == null)
					break;
				sb.append(data).append("\n");
			}
			System.out.println(sb.toString());
			System.out.println("공백 제외 글자수 : " + sb.toString().replace(" ", "").length());
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
