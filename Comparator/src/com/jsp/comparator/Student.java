package com.jsp.comparator;

public class Student {
	
	int age;
	int standard;
	
	
	public Student(int age,int standard) {
		this.age=age;
		this.standard=standard;
	}
	
	public String toString() {
		return "Student age is "+age+" and Student Class is "+standard;
	}
}


