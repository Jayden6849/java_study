package com.gn.practice01;

import java.io.File;

public class Practice {
	public void deleteFile(File dir) {
		File[] files = dir.listFiles();
		
		for(File f : files) {
			if(f.isDirectory()) {
				deleteFile(f);
			}
			f.delete();
		}
	}
}
	