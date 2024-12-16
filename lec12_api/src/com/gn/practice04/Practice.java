package com.gn.practice04;

import java.util.Objects;

public class Practice {
	 int studno;
	 String name;
	 String major;
	@Override
	public int hashCode() {
		return Objects.hash(major, name, studno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Practice other = (Practice) obj;
		return Objects.equals(major, other.major) && Objects.equals(name, other.name) && studno == other.studno;
	}
	public String deleteBlank(String str) {
		return str.replace(" ", "");
	}
}
