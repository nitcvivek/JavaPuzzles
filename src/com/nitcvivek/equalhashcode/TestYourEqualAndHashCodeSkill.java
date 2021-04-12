package com.nitcvivek.equalhashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TestYourEqualAndHashCodeSkill 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student("CS04C010","Vivek Jaiswal");
		Student student2 = new Student("CS04C010","Rakesha");
		
		Set<Student> students = new HashSet<Student>();
		students.add(student1);
		
		System.out.println(students.contains(student2));
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		
		System.out.println(studentList.contains(student2));
	}
	
	static class Student{
		private Long id;
		private String enrollmentId;	
		private String name;
		
		public Student() {};
		
		public Student(String enrollmentId, String name) {
			this.enrollmentId = enrollmentId;
			this.name = name;
		}
		
		@Override
		public boolean equals(Object obj) 
		{
			if (!(obj instanceof Student)) return false;
			Student other = (Student) obj;
			return Objects.equals(enrollmentId, other.enrollmentId);
		}
	}
}
