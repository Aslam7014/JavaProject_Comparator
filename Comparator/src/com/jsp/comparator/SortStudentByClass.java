package com.jsp.comparator;

import java.util.Comparator;

public class SortStudentByClass implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		return x.standard-y.standard;
	}

}
