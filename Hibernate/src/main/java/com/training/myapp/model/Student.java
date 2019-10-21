package com.training.myapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table (name="students")
public class Student {
	@Id
	@Column (name="student_roll")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRoll;
	@Column (name="student_name")
	private String studentName;
	@Column (name="student_age")
	private int studentAge;
	@Column (name="student_course")
	private String studentCourse;

	public Student(String studentName, int studentAge, String studentCourse) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCourse = studentCourse;
	}

	public Student() {
		super();
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentCourse=" + studentCourse + "]";
	}

}
