package com.gn.study.controller;

import java.util.Arrays;

public class SystemRun {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		// 1. arraycopy()
		int[] src = {10, 15, 20, 25, 30};
		
		int[] dst = new int[src.length];
		
//		for(int i=0; i<src.length; i++) {
//			dst[i] = src[i];
//		}
//		
//		for(int d : dst) {
//			System.out.print(d + " | ");
//		}
//		System.out.println();
		
		System.arraycopy(src, 0, dst, 0, src.length);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dst));
		
		long after = System.currentTimeMillis();
		System.out.println(after - before);
		
		// 2. currentTimeMillis();
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
	}
}
