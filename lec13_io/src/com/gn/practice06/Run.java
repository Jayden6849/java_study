package com.gn.practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\practice");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		File file = new File(dir, "output.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};
			for(int i=0; i< lines.length; i++) {
				bw.write(lines[i]);
				bw.newLine();
			}
			
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
