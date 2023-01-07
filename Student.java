package com.collections.bll;

public class Student implements Comparable<Student> {
	private String studentCode;
	private String studentName;
	private Integer age;
	private String state;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentCode, String studentName, Integer age, String state) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.age = age;
		this.state = state;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", age=" + age + ", state="
				+ state + "]";
	}

	// Sort students by state and student name.
	
	@Override
	public int compareTo(Student student) {
		
		/*if(getState().compareTo(student.getState()) == 0)
			return 0;
		else if(getState().compareTo(student.getState()) > 0)
			return 1;
		else 
			return -1;
			*/
		//return getState().compareTo(student.getState());
		
		if(getState().compareTo(student.getState()) == 0)
			return getStudentName().compareTo(student.getStudentName());
		else if(getState().compareTo(student.getState()) > 0)
			return getStudentName().compareTo(student.getStudentName());
		else 
			return getStudentName().compareTo(student.getStudentName());
	}

	/*
	@Override
	public int compareTo(Student student) {
		if(getAge() == student.getAge())
			return 0;
		else if(getAge() > student.getAge())
			return 1;
		else 
			return -1;
	}
	*/
	
	
}
