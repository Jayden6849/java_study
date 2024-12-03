package com.gn.practice02.model.vo;

public class Song {
	public String songTitle;
	protected String singer;
	private static int publishYear = 2009;
	private final static String ALBUM_NAME = "1집";
	
	public static int getPublishYear() {
		return publishYear;
	}
	public static void setPublishYear(int publishYear) {
		Song.publishYear = publishYear;
	}
	public static String getAlbumName() {
		return ALBUM_NAME;
	}
}
