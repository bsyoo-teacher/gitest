package com.git.model.dto;

public class Student {
	private int studetNo;
	private String studentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studetNo, String studentName) {
		super();
		this.studetNo = studetNo;
		this.studentName = studentName;
	}

	public int getStudetNo() {
		return studetNo;
	}

	public void setStudetNo(int studetNo) {
		this.studetNo = studetNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
