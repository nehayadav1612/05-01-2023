package com.collections.pll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collections.bll.Student;

public class Exercise002 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("AF0216223", "Aryan Raj", 21, "Andra Pradhesh"));
		studentList.add(new Student("AF0216224", "Bivor Kumar", 22, "Andra Pradhesh"));
		studentList.add(new Student("AF0216227", "SUSHMITA KUMARI", 23, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216231", "Ragiv Zafar", 24, "Maharashtra"));		
		studentList.add(new Student("AF0216232", "RAHUL MAHTO", 25, "Orissa"));		
		studentList.add(new Student("AF0216234", "Nainsi Kumari", 19, "Gujarath"));		
		studentList.add(new Student("AF0216236", "MD ALI", 26, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216238", "ABHISHEK KUMAR", 22, "Andra Pradhesh"));		
		studentList.add(new Student("AF0216240", "AFROZ ANSARI", 21, "Maharashtra"));		
		studentList.add(new Student("AF0216259", "RITIK RAJ", 20, "Orissa"));		
		studentList.add(new Student("AF0216263", "Anant Kumar", 25, "Andra Pradhesh"));
		studentList.add(new Student("AF0216305", "BABU KUMAR", 24, "Gujarath"));		
		studentList.add(new Student("AF0216307", "NIKITA KUMARI", 23, "Madhya Pradesh"));		
		studentList.add(new Student("AF0216353", "PRANAV PANDEY", 22, "Orissa"));		
		studentList.add(new Student("AF0216964", "Radheshyam Kumar", 21, "Maharashtra"));		
		studentList.add(new Student("AF0216973", "Ankur Utpal", 19, "Gujarath"));		
		studentList.add(new Student("AF0217607", "Banty Mishra", 18, "Madhya Pradesh"));		
		studentList.add(new Student("AF0217615", "RIYA KUMARI", 20, "Karnataka"));
		studentList.add(new Student("AF0217791", "Priyadarshani Kumari", 21, "Maharashtra"));		
		studentList.add(new Student("AF0223373", "Chanchal Thakur", 22, "Orissa"));
		studentList.add(new Student("AF0221549", "SATENDRA KUMAR", 23, "Maharashtra"));
		studentList.add(new Student("AF0216212", "Pappi Verma", 24, "Kerala"));		
		studentList.add(new Student("AF0216244", "Ramkrishna Kushwah", 25, "Andra Pradhesh"));
		studentList.add(new Student("AF0216245", "Yogita Tamoliya", 26, "Orissa"));
		
		// 1. Find the students aged over 20
		/*
		for(Student student:studentList)
			if(student.getAge() > 20)
				System.out.println(student);
		*/
		
		/*
		List<Student> greateThan20 = new ArrayList<Student>();
		
		for(Student student:studentList)
			if(student.getAge() > 20)
				greateThan20.add(student);
		
		//System.out.println("Students greater thab 20 age: " + greateThan20);
		for(Student student:greateThan20)
			System.out.println(student);
		
		// 2. Find students from the state Andhra Pradhesh
		
		System.out.println("Students from the state Andhra Pradhesh\n\n");
		for(Student student:studentList) {
			if(student.getState().equals("Andra Pradhesh")) {
				System.out.println(student);
			}
		}
		*/
		
		//3. Sort students by their age.
		
		/*
		Collections.sort(studentList);
		
		for(Student student:studentList) {
			System.out.println(student);
		}
		*/
		//4. Sort students by state and student name.
		Collections.sort(studentList);
		
		for(Student student:studentList) {
			System.out.println(student);
		}
		
	}

}
