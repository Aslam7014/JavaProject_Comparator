package com.jsp.comparator;

import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(12, 7);
		Student s2 = new Student(13, 8);
		Student s3 = new Student(10, 4);
		Student s4 = new Student(11, 6);
		
		SortStudentByAge age = new SortStudentByAge();
		SortStudentByClass standard = new SortStudentByClass();
		
		TreeSet<Student> ts = new TreeSet<Student>(age);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		for(Student a:ts) {
			System.out.println(a);
		}
		
		
	}

}
