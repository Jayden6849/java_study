package com.gn.homework03.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File dir = new File("C:\\test\\sub\\homework");
		
		File f = new File(dir, file);
		return f.exists();
	}
	public void fileSave(String file, String s) {
		File dir = new File("C:\\test\\sub\\homework");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		File f = new File(dir, file);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write(s);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		File dir = new File("C:\\test\\sub\\homework");
		
		File f = new File(dir, file);
		
		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String data;
			while(true) {
				data = br.readLine();
				if(data == null) break;
				sb.append(data).append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return sb;
	}
	public void fileEdit(String file, String s) {
		File dir = new File("C:\\test\\sub\\homework");
		
		File f = new File(dir, file);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
			bw.write(s);
			bw.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
