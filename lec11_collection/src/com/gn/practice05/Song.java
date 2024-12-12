package com.gn.practice05;

import java.util.Objects;

public class Song {
	private String name;
	private String singer;
	
	public Song() {
		super();
	}
	public Song(String name, String singer) {
		super();
		this.name = name;
		this.singer = singer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Song)) return false;
			
		Song other = (Song) obj;
		return Objects.equals(this.name, other.name) && Objects.equals(this.singer, other.singer);
	}
	@Override
	public String toString() {
		return "{제목="+name+",가수="+singer+"}";
	}
 }
