package com.tcs.entity;

public class VarArgsDemo {
	public static void main(String[] args) {
		String[] subjects = { "maths", "english" };
		Student student = new Student(subjects);
		System.out.println(student.subjects[0]);

		Student student1 = new Student("Science");
		System.out.println(student.subjects[0]);
	}
}

class Student {
	String[] subjects;
//	public Student(String[] subjects) {//can pass only arrays
//	 this.subjects=subjects;	
//	}

	public Student(String... subjects) {// VarArgs more Flexible
		this.subjects = subjects;
	}
}
